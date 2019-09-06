package com_spring_form_demo;

import java.sql.Array;
import java.util.Arrays;
/*public class Student {
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	private String firstName;
	private String lastName;
	

	public Student() {
		// TODO Auto-generated constructor stub
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

} */
import java.util.LinkedHashMap;

public class Student {

	public Student(String firstName, String lastName, String country, String favoriteLanguage,
			String[] operatingsystem) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.favoriteLanguage = favoriteLanguage;
		this.operatingsystem = operatingsystem;
	}


	private String firstName;
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;

	private String favoriteLanguage;
	private String[] operatingsystem;
	
	public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<String,String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");		

	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", countryOptions=" + countryOptions + ", favoriteLanguage=" + favoriteLanguage + ", Operatingsystem="
				+ Arrays.toString(operatingsystem) + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingsystem() {
		return operatingsystem;
	}

	public void setOperatingsystem(String[] operatingsystem) {
		this.operatingsystem = operatingsystem;
	}

	public Array setOperatingsystem(Array array) {
		return array;
		// TODO Auto-generated method stub
		
	}

}
