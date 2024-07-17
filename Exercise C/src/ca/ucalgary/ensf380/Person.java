package ca.ucalgary.ensf380;

abstract class Person {
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private static int lastPersonalNumber;
	
	protected static String nextPersonalNumber(short type) {
		//TODO code this method
	}
	
	public boolean hasValidAddress() {
		
	}
}
