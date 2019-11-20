package com.finalProject.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.entity.Passenger;
import com.finalProject.repository.PassengerRepository;

@Service
@Transactional
public class PassengerServiceImp implements PassengerService {
	
	private PassengerRepository psr;
	

	public PassengerServiceImp() {
		
	}
	
	@Autowired
	public PassengerServiceImp(PassengerRepository psr) {
		this.psr = psr;
	}


	@Override
	public List<Passenger> getAllPassenger() {
		List<Passenger> plist = new ArrayList<Passenger>();
		psr.findAll().forEach(e-> plist.add(e));
		return plist;
	}

	@Override
	public Passenger getPassengerById(Long id) {
		Passenger passenger = psr.findById(id).get();
		return passenger;
	}

	@Override
	public boolean savePassenger(Passenger passenger) {

		try{
			psr.save(passenger);
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}

	@Override
	public boolean deletePassengerById(Long id) {
		try{
			psr.deleteById(id);
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}
	
	

}
