package ca.ucalgary.ensf380;

public class Series {
	
	//Private Data Members:
	
	private String seriesName;
	
	//Public Getter Member Methods/Functions:
	
	public String getSeriesName() {
		return seriesName;
	}
	
	//Public Setter Member Methods/Functions:
	
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	
	//Public Other Member Methods/Functions:
	
	public String theme() {
        return "The Method 'theme' Is Called From The Series Class";
    }
}
