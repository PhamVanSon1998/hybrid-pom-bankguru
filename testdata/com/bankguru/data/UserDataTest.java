package com.bankguru.data;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserDataTest {

	public static UserDataTest getFile(String fileName) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
			return mapper.readValue(new File(fileName), UserDataTest.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@JsonProperty("firstName")
	private String firstName;
	
	@JsonProperty("lastName")
	private String lastName;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("companyName")
	private String companyName;
	
	@JsonProperty("password")
	private String password;
	
	@JsonProperty("day")
	private String day;
	
	@JsonProperty("month")
	private String month;
	
	@JsonProperty("year")
	private String year;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getPassword() {
		return password;
	}

	public String getDay() {
		return day;
	}

	public String getMonth() {
		return month;
	}

	public String getYear() {
		return year;
	}
	
	@JsonProperty("register")
	Register reg;
	
	static class Register {
		@JsonProperty("city")
		String city;
	}
	
	public String getCity() {
		return reg.city;
	}
	
}
