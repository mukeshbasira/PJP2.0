package com.app.attribute;

public class AttributeWriting {
	String cityOrCountry;

	public String getCityOrCountry() {
		return cityOrCountry;
	}

	public void setCityOrCountry(String cityOrCountry) {
		this.cityOrCountry = cityOrCountry;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Float getAvgincome() {
		return avgincome;
	}

	public void setAvgincome(Float avgincome) {
		this.avgincome = avgincome;
	}

	String gender;

	Float avgincome;






	public AttributeWriting(String cityOrCountry, String gender, Float avgincome) {
		super();
		this.cityOrCountry = cityOrCountry;
		this.gender = gender;
		this.avgincome = avgincome;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cityOrCountry  " + cityOrCountry + "\n" + "gender  "
		+ gender
		+ "\n"
		+ "avgincome  " + avgincome;
	}






}
