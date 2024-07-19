package ca.ucalgary.ensf380;

public class Nonfiction {

	//Private Data Members:
	
	private Category deweyClassification;
	
	//Public Getter Member Methods/Functions: 
	
	public Category getDeweyClassification() {
		return deweyClassification;
	}
	
	//Public Setter Member Methods/Functions: 
	
	public void setDeweyClassification(Category deweyClassification) {
		this.deweyClassification = deweyClassification;
	}
	
	//Public Other Member Methods/Functions: 
	
	public String topic() {
        return "The Method 'topic' Is Called From The Nonfiction Class";
    }
}
