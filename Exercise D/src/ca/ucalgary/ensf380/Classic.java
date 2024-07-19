package ca.ucalgary.ensf380;

public class Classic {

	//Private Data Members:
	
	private int origPubYear = 1860;
	private Author theAuthor;
	private Publisher[] bookPublisher;

	//Public Getter Member Methods/Functions:
	
	public int getOrigPubYear() {
		return origPubYear;
	}
	
	public Author getTheAuthor() {
		return theAuthor;
	}
	
	public Publisher[] getBookPublisher() {
		return bookPublisher;
	}
	
	//Public Setter Member Methods/Functions: 
	
	public void setOrigPubYear(int origPubYear) {
		this.origPubYear = origPubYear;
	}
	
	public void setTheAuthor(Author theAuthor) {
		this.theAuthor = theAuthor;
	}
	
	public void setBookPublisher(Publisher[] bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	//Public Other Member Methods/Functions:
	
	public String createNotes() {
        StringBuilder sb = new StringBuilder();
        
        // Append The Original Publication Year:
        
        sb.append("The Original Publication Year: ").append(origPubYear).append("\n");
        
        // Append The Author Details:
        
        if (theAuthor != null) {
            sb.append("Author: ").append(theAuthor.getName())
              .append(", Address: ").append(theAuthor.getAddress())
              .append(", Age: ").append(theAuthor.getAge()).append("\n");
        } else {
            sb.append("Author: Not Assigned\n");
        }
        
        // Append The Publisher Details:
        
        if (bookPublisher != null && bookPublisher.length > 0) {
            sb.append("Publishers: ");
            for (Publisher publisher : bookPublisher) {
                if (publisher != null) {
                    sb.append(publisher.getName()).append(" (")
                      .append(publisher.getAddress()).append("), ");
                }
            }
            
            // Remove The Trailing Comma And Space:
            
            sb.setLength(sb.length() - 2);
        } else {
            sb.append("Publishers: Not assigned\n");
        }

        return sb.toString();
    }
}
