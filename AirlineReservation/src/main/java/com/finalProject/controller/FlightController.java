package com.finalProject.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.entity.FlightSearch;
import com.finalProject.service.FlightService;

@Controller
public class FlightController {
	
	private FlightService flightservice;
	public FlightController() {
		
	}
	
	@Autowired
	public FlightController(FlightService flightservice) {
		this.flightservice = flightservice;
	}
	

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView hello(HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/allFlights", method = RequestMethod.POST)
	public ModelAndView displayAllFlight() {
		System.out.println("Admin Requested : All Flights");
		ModelAndView mv = new ModelAndView();
		List<FlightSearch> flightList = flightservice.getAllFlightDetails();
		mv.addObject("flightList", flightList);
		mv.setViewName("allFlights");
		return mv;
	}

	@RequestMapping(value = "/addFlight", method = RequestMethod.GET)
	public ModelAndView displayNewFlightForm() {
		ModelAndView mv = new ModelAndView("addFlight");
		mv.addObject("headerMessage", "Add Flight Details");
		mv.addObject("flightdetails", new FlightSearch());
		return mv;
	}
	
	@RequestMapping(value = "/addFlight", method = RequestMethod.POST)
	public ModelAndView saveNewUser(@ModelAttribute FlightSearch fsearch, BindingResult result) {
		ModelAndView mv = new ModelAndView("redirect:/home");

		if (result.hasErrors()) {
			return new ModelAndView("error");
		}
		boolean isAdded = flightservice.saveFlight(fsearch);
		if (isAdded) {
			mv.addObject("message", "New flight detail successfully added");
		} else {
			return new ModelAndView("error");
		}

		return mv;
	}
	
	
	@RequestMapping(value = "/editFlight/{id}", method = RequestMethod.GET)
	public ModelAndView displayEditFlightForm(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("/editFlight");
		FlightSearch flightsearch = flightservice.getFlightById(id);
		mv.addObject("headerMessage", "Edit Flight Details");
		mv.addObject("flightdetails", flightsearch);
		return mv;
	}
	
	@RequestMapping(value = "/editFlight/{id}", method = RequestMethod.POST)
	public ModelAndView saveEditedUser(@ModelAttribute FlightSearch flightsearch, BindingResult result) {
		ModelAndView mv = new ModelAndView("redirect:/home");

		if (result.hasErrors()) {
			System.out.println(result.toString());
			return new ModelAndView("error");
		}
		boolean isSaved = flightservice.saveFlight(flightsearch);
		if (!isSaved) {

			return new ModelAndView("error");
		}

		return mv;
	}
	@RequestMapping(value = "/deleteFlight/{id}", method = RequestMethod.GET)
	public ModelAndView deleteFlightById(@PathVariable Long id) {
		boolean isDeleted = flightservice.deleteFlightById(id);
		System.out.println("Flight deletion respone: " + isDeleted);
		ModelAndView mv = new ModelAndView("redirect:/home");
		return mv;

	}

	
}
