package com.finalProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.entity.FlightSearch;
import com.finalProject.repository.FlightSearchRepository;


@Service
@Transactional
public class FlightServiceImp implements FlightService{
	
	private FlightSearchRepository fsp;
	

	public FlightServiceImp() {
	}
	
	@Autowired
	public FlightServiceImp(FlightSearchRepository fsp) {
		this.fsp = fsp;
	}

	@Override
	public List<FlightSearch> getAllFlightDetails() {
		List<FlightSearch> flist = new ArrayList<FlightSearch>();
		fsp.findAll().forEach(e-> flist.add(e));
		return flist;
	}

	@Override
	public FlightSearch getFlightById(Long id) {
		FlightSearch flightsearch = fsp.findById(id).get();
		
		return flightsearch;
	}

	@Override
	public boolean saveFlight(FlightSearch flightsearch) {
		
		try{
			fsp.save(flightsearch);
			return true;
		}
		catch(Exception ex){
			return false;
		}	
	}

	@Override
	public boolean deleteFlightById(Long id) {
		try{
			fsp.deleteById(id);
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	
	

}
