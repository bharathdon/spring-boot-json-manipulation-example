package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	private String salutation;
	private String role;
	private String SPcorporateType;
	private Integer AgentTypeID;
	private String phone;

	@JsonIgnoreProperties
	private Address address;

	@Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("user detais");
		stringBuilder.append("******************");
		stringBuilder.append("salutation =  " + getSalutation());
		stringBuilder.append("role =  " + getRole());
		stringBuilder.append("SPcorporateType =  " + getSPcorporateType());
		stringBuilder.append("AgentTypeID =  " + getAgentTypeID());
		stringBuilder.append("phone = " + getPhone());
		stringBuilder.append("address = " + getAddress());
		stringBuilder.append("***********************");

		return stringBuilder.toString();
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSPcorporateType() {
		return SPcorporateType;
	}

	public void setSPcorporateType(String sPcorporateType) {
		SPcorporateType = sPcorporateType;
	}

	public Integer getAgentTypeID() {
		return AgentTypeID;
	}

	public void setAgentTypeID(Integer agentTypeID) {
		AgentTypeID = agentTypeID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonProperty("Address")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
