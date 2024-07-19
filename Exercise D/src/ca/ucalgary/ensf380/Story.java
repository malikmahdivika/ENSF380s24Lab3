package ca.ucalgary.ensf380;

public class Story {

	//Private Data Members:
	
	private Author[] theAuthors;
	
	//Public Getter Member Methods/Functions: 
	
	public Author[] getTheAuthors() {
		return theAuthors;
	}
	
	//Public Setter Member Methods/Functions:
	
	public void setTheAuthors(Author[] theAuthors) {
		this.theAuthors = theAuthors;
	}
	
	//Public Other Member Methods/Functions:
	
	public String plot() {
        return "The Method 'plot' Is Called From The Story Class";
    }
}
