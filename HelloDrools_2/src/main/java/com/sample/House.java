package com.sample;

import java.util.ArrayList;
import java.util.List;
import com.sample.Person;

public class House {
	private String name;
	private String streetName;
	private int houseNumber;
	List<Person> inhabitants = new ArrayList<Person>();    	
	
	
	//constructor
	public House(String name, String streetName, int houseNumber) {
		super();
		this.name = name;
		this.streetName = streetName;
		this.houseNumber = houseNumber;
	}
	
	//getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}	
	public List<Person> getInhabitants() {
		return inhabitants;
	}

	public void setInhabitants(List<Person> inhabitants) {
		this.inhabitants = inhabitants;
	}

	
	
	void addPerson(Person person){
		inhabitants.add(person);
	}

	@Override
	public String toString() {
		return "House [name=" + name + ", streetName=" + streetName + ", houseNumber=" + houseNumber
				+ ", inhabitants=" + inhabitants + "]";
	}
	
	
}
