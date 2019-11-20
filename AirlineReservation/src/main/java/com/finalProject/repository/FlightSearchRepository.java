package com.finalProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finalProject.entity.FlightSearch;

@Repository
public interface FlightSearchRepository extends 
CrudRepository<FlightSearch, Long>{
	
	

}
