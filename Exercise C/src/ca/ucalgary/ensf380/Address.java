package ca.ucalgary.ensf380;

public class Address {
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	public boolean validate() {
		//TODO make validation
	}
	
	public String outputAsLabel() {
		String out = street +" "+ city +" "+ state +", "+ country +" "+ postalCode;
		return out;
	}
}
