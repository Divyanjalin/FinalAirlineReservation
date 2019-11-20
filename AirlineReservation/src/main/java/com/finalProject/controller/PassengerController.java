package com.finalProject.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.entity.Passenger;
import com.finalProject.service.PassengerService;

@Controller
public class PassengerController {
	
	private PassengerService passengerservice;
	public PassengerController(){
		
	}
	
	@Autowired
	public PassengerController(PassengerService passengerservice) {
		this.passengerservice = passengerservice;
	}
	
	
	
	@RequestMapping(value = "/allPassenger", method = RequestMethod.POST)
	public ModelAndView displayAllFlight() {
		System.out.println("Admin Requested : All Passenger");
		ModelAndView mv = new ModelAndView();
		List<Passenger> passengerList = passengerservice.getAllPassenger();
		mv.addObject("passengerList", passengerList);
		mv.setViewName("allPassenger");
		return mv;
	}

	@RequestMapping(value = "/addPassenger", method = RequestMethod.GET)
	public ModelAndView displayNewPassengerForm() {
		ModelAndView mv = new ModelAndView("addPassenger");
		mv.addObject("headerMessage", "Add Passenger Details");
		mv.addObject("passenger", new Passenger());
		return mv;
	}
	
	@RequestMapping(value = "/addPassenger", method = RequestMethod.POST)
	public ModelAndView saveNewUser(@ModelAttribute Passenger passenger, BindingResult result) {
		ModelAndView mv = new ModelAndView("redirect:/home");

		if (result.hasErrors()) {
			return new ModelAndView("error");
		}
		boolean isAdded = passengerservice.savePassenger(passenger);
		if (isAdded) {
			mv.addObject("message", "New flight detail successfully added");
		} else {
			return new ModelAndView("error");
		}

		return mv;
	}
	
	
	

}
