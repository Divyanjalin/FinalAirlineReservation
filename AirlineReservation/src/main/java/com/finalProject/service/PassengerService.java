package com.finalProject.service;

import java.util.List;

import com.finalProject.entity.Passenger;

public interface PassengerService {
	
	
	public List<Passenger> getAllPassenger();
	public Passenger getPassengerById(Long id);
	public boolean savePassenger(Passenger passenger);
	public boolean deletePassengerById(Long id);
	

}
