package com.finalProject.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="flightsearch")
public class FlightSearch {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="flight-seq")
	@SequenceGenerator(name="flight-seq",sequenceName="flight_seq",allocationSize=1)
	private long flight_id;
	private String flight_name;
	private String to_loc;
	private String from_loc;
	private String flight_date;
	private String departure_time;
	private String arrival_time;
	private String duration;
	
	public long getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(long flight_id) {
		this.flight_id = flight_id;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getTo_loc() {
		return to_loc;
	}
	public void setTo_loc(String to_loc) {
		this.to_loc = to_loc;
	}
	public String getFrom_loc() {
		return from_loc;
	}
	public void setFrom_loc(String from_loc) {
		this.from_loc = from_loc;
	}
	public String getFlight_date() {
		return flight_date;
	}
	public void setFlight_date(String date) {
		this.flight_date = date;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "FlightSearch [flight_id=" + flight_id + ", flight_name=" + flight_name + ", to_loc=" + to_loc
				+ ", from_loc=" + from_loc + ", flight_date=" + flight_date + ", departure_time=" + departure_time
				+ ", arrival_time=" + arrival_time + ", duration=" + duration + "]";
	}
	
	
	

}
