package ca.ucalgary.ensf380;
import java.util.regex.*;


abstract class Person {
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	
	public boolean hasValidAddress() {
		/*validates a Person object's address by running address.validate()
		 * on each Address object field.
		 */
		boolean[] validations = new boolean[5];
		
		validations[0] = this.address.validate(this.address.getStreet());
		validations[1] = this.address.validate(this.address.getCity());
		validations[2] = this.address.validate(this.address.getState());
		validations[3] = this.address.validate(this.address.getPostalCode());
		validations[4] = this.address.validate(this.address.getCountry());
		
		for (boolean check : validations) {
			if (check) {
				return false; //if any field failed to validate
			}
		}
		return true; //otherwise if all fields passed, the address is valid.
	}
	
	//setters and getters
	protected void setName(String name) {
		this.name = name;
	}
	protected String getName() {
		return this.name;
	}
	
	protected void setPhoneNumber(String number) {
		//number must be 3numbers-3numbers-4numbers
		if (Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4}$").matcher(number).find()) {
			this.phoneNumber = number;
		} else {
			return;//TODO throw exception?
		}
	}
	protected String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	protected void setEmailAddress(String email) {
		//email must be in format (string)@(string).(string)
		if (Pattern.compile("^[a-z._0-9]{1,}@[a-z]{1,}[.][a-z]{2,3}$").matcher(email).find()) {
			this.emailAddress = email;
		} else {
			return;
		}
	}
	protected String getEmailAddress() {
		return this.emailAddress;
	}
	
	protected void setAddress(Address address) {
		this.address = address;
	}
	protected String getAddress() {
		return this.address.outputAsLabel();
	}
}
