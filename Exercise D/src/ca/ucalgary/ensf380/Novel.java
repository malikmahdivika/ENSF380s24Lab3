package ca.ucalgary.ensf380;

public class Novel {

	//Private Data Members: 
	
	private Author[] theAuthors;
	private Series mySeries;
	
	//Public Getter Member Methods/Functions: 
	
	public Author[] getTheAuthors() {
		return theAuthors;
	}
	
	public Series getMySeries() {
		return mySeries;
	}
	
	//Public Setter Member Methods/Functions:
	
	public void setTheAuthors(Author[] theAuthors) {
		this.theAuthors = theAuthors;
	}
	
	public void setMySeries(Series mySeries) {
		this.mySeries = mySeries;
	}
	
	//Public Other Member Methods/Functions: 
	
	public String theme() {
        return "The Method 'theme' Is Called From The Novel Class";
    }
}
