package com.spring;

public class Address {
	
	private String city;
	private String state;
	private long zipCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String city, String state, long zipCode) {
		super();
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

}
