package ca.ucalgary.ensf380;

public class Book {

	//Private Data Members:
	
	private String isbn;
	private int publicationYear;
	private int pages;
	
	//Public Default Constructor
	
	public Book() {
		this.isbn = "Unknown";
		this.publicationYear = 0;
		this.pages = 0;
	}
	
	//Public Other Constructor:
	
	public Book(String isbn, int publicationYear, int pages) {
		this.isbn = isbn;
		this.publicationYear = publicationYear;
		this.pages = pages;
	}
	
	//Public Getter Member Methods/Functions:
	
	public String getIsbn() {
		return isbn;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public int getPages() {
		return pages;
	}
	
	//Public Setter Member Methods/Functions:
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
}
