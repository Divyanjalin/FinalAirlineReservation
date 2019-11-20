package com.finalProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Passenger")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pass-seq")
	@SequenceGenerator(name="pass-seq",sequenceName="pass_seq",allocationSize=1)
	
	private long passenger_id;
	private String passenger_name;
	private String gender;
	private int age;
	public long getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(long passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Passenger [passenger_id=" + passenger_id + ", passenger_name=" + passenger_name + ", gender=" + gender
				+ ", age=" + age + "]";
	}
	
	
	
}
