package eCom.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {

	@Id
	@GeneratedValue
	
	int categoryId;
	String categoryName;
	String categoryDesc;
	
	// Getter/Setter For CategoryId
	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	// Getter/Setter for Category Name
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	// Getter/Setter for Category Description
	public String getCategoryDesc() {
		return categoryDesc;
	}
	
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	
	
}
