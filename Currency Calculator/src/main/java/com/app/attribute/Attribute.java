package com.app.attribute;

public class Attribute {

	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public Float getAvgIncomeInteger() {
		return avgIncomeInteger;
	}

	public void setAvgIncomeInteger(Float avgIncomeInteger) {
		this.avgIncomeInteger = avgIncomeInteger;
	}

	String country;

	String gender;

	String Currency;
	Float avgIncomeInteger;

	public Attribute() {
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "city  " + city + "\n" + "country  " + country + "\n" + "gender  " + gender + "\n" + "Currency  "
		+ Currency + "\n" + "avgIncomeInteger  " + avgIncomeInteger;
	}

	public Attribute(String city, String country, String gender, String currency, Float avgIncomeInteger) {
		super();
		this.city = city;
		this.country = country;
		this.gender = gender;
		Currency = currency;
		this.avgIncomeInteger = avgIncomeInteger;
	}





}
