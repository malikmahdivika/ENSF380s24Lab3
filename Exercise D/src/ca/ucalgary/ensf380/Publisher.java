package ca.ucalgary.ensf380;

public class Publisher {

	//Private Data Members: 
	
	private String name;
	private String address;
	private Classic[] classicsCatalog;
	
	//Public Other Constructor:
	
	public Publisher(String name, String address) {
		this.name = name; 
		this.address = address;
	}
	
	//Public Getter Member Methods/Functions:
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Classic[] getClassicsCatalog() {
		return classicsCatalog;
	}
	
	//Public Setter Member Methods/Functions:
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setClassicsCatalog(Classic[] classicsCatalog) {
		this.classicsCatalog = classicsCatalog;
	}
	
	//Public Other Member Methods/Functions:
	
	public String printLetterHead() {
        return "Publisher Name: " + name + "\n" + 
               "Publisher Address: " + address + "\n";
    }
}
