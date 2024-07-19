package ca.ucalgary.ensf380;

public class Contract {
	
	//Private Data Members
	
	private String date;
	private Publisher publisherInfo;
	private Author[] authorInfo;
	
	//Public Other Constructor:
	
	public Contract(String date, Publisher publisherInfo, Author[] authorInfo) {
		this.date = date;
		this.publisherInfo = publisherInfo;
		this.authorInfo = authorInfo;
	}
	
	//Public Getter Member Methods/Functions:
	
	public String getDate() {
		return date;
	}
	
	public Publisher getPublisherInfo() {
		return publisherInfo;
	}
	
	public Author[] getAuthorInfo() {
		return authorInfo;
	}
	
	//Public Setter Member Methods/Functions: 
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setPublisherInfo(Publisher publisherInfo) {
		this.publisherInfo = publisherInfo;
	}
	
	public void setAuthorInfo(Author[] authorInfo) {
		this.authorInfo = authorInfo;
	}
	
	//Public Other Member Methods/Functions: 
	
	public String printContract() {
        StringBuilder sb = new StringBuilder();

        // Append The Contract Date
        
        sb.append("Contract Date: ").append(date).append("\n");

        // Append The Publisher Information
        
        if (publisherInfo != null) {
            sb.append("Publisher: ").append(publisherInfo.getName())
              .append(", Address: ").append(publisherInfo.getAddress()).append("\n");
        } else {
            sb.append("Publisher: Not assigned\n");
        }

        // Append The Author Information
        
        if (authorInfo != null && authorInfo.length > 0) {
            sb.append("Authors: \n");
            for (Author author : authorInfo) {
                if (author != null) {
                    sb.append("- Name: ").append(author.getName())
                      .append(", Address: ").append(author.getAddress())
                      .append(", Age: ").append(author.getAge()).append("\n");
                }
            }
        } else {
            sb.append("Authors: Not assigned\n");
        }

        return sb.toString();
    }
}
