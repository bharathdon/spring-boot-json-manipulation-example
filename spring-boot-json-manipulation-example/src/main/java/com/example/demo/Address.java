package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

	@JsonIgnore
	private String Address1;
	@JsonIgnore
	private String Address2;
	private String state;
	private String PinCode;

	@JsonIgnore
	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}
@JsonIgnore
	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		Address2 = address2;
	}

	@JsonProperty("Address1")
	public String getAddress() {
		return getAddress1() + "," + getAddress2();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return PinCode;
	}

	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}

	@Override
	public String toString() {
		return getAddress1() + "," + getAddress2() + "," + getState() + "," + getPinCode();
	}

}
