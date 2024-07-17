package ca.ucalgary.ensf380;

import java.util.regex.Pattern;

public class Address {
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	//Constructor
	Address(String street, String city, String state, String country, String postalCode) {
		this.setStreet(street);
		this.setCity(city);
		this.setState(state);
		this.setCountry(country);
		this.setPostalCode(postalCode);
	}
	
	//setters only, the one getter is the outputAsLabel method
	public void setStreet(String streetName) {
		if (this.validate(streetName)) {
			this.street = streetName;
		} else {
			return;
		}
	}
	public void setCity(String cityName) {
		if (this.validate(cityName)) {
			this.city = cityName;
		} else {
			return;
		}
	}
	public void setState(String stateName) {
		if (this.validate(stateName)) {
			this.state = stateName;
		} else {
			return;
		}
	}
	public void setPostalCode(String postalCode) {
		if (this.validate(postalCode)) {
			this.postalCode = postalCode;
		} else {
			return;
		}
	}
	public void setCountry(String countryName) {
		if (this.validate(countryName)) {
			this.country = countryName;
		} else {
			return;
		}
	}
	
	public boolean validate(String field) {
		/* Whole addresses are hard to validate as they vary so much, but instead
		 * we can check each field to match a given format such that the setters
		 * will use this function directly.
		 */
		
		//we assume that only letters, digits, and maybe # and . are allowed
		Pattern pattern = Pattern.compile("^[A-Za-z0-9 #.]*$");
		if (pattern.matcher(field).find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String outputAsLabel() {
		String out = street +" "+ city +", "+ state +" "+ country +" "+ postalCode;
		return out;
	}
}
