package com.finalProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finalProject.entity.Passenger;


@Repository
public interface PassengerRepository extends 
CrudRepository<Passenger, Long>{

}
