package ca.ucalgary.ensf380;

public class Author {

	//Private Data Members:
	
	private String name;
	private String address;
	private int age;
	
	//Public Default Constructor:
	
	public Author() {
		this.name = "Unknown";
		this.address = "Unknown";
		this.age = 0;
	}
	
	//Public Other Constructor:
	
	public Author(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	//Public Getter Member Methods/Functions:
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	//Public Setter Member Methods/Functions:
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//Public Other Member Methods/Functions:
	
	public String write() {
        return String.format("Author Name: %s\nAddress: %s\nAge: %d", name, address, age);
    }
}
