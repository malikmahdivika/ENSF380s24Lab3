package ca.ucalgary.ensf380;

public class Category {

	//Private Data Members:
	
	private Category subCategory;
	private Category superCategory;
	private String category;
	
	//Public Getter Member Methods/Functions: 
	
	public Category getSubCategory() {
		return subCategory;
	}
	
	public Category getSuperCategory() {
		return superCategory;
	}
	
	public String getCategory() {
		return category;
	}
	
	//Public Setter Member Methods/Functions: 
	
	public void setSubCategory(Category subCategory) {
		this.subCategory = subCategory;
	}
	
	public void setSuperCategory(Category superCategory) {
		this.superCategory = superCategory;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	//Public Other Member Methods/Functions:
	
	public String sort() {
        StringBuilder sb = new StringBuilder();

        // Append The Category Name
        
        sb.append("Category: ").append(category);

        // Append Super-Category If It Exists
        
        if (superCategory != null) {
            sb.append("\nSuper-Category: ").append(superCategory.getCategory());
        }

        // Append Sub-Category If It Exists!
        
        if (subCategory != null) {
            sb.append("\nSub-Category: ").append(subCategory.getCategory());
        }

        return sb.toString();
    }
}
