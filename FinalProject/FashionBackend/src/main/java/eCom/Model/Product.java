package eCom.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue
	
	int productId;
	String productName;
	String prodcutDesc;
	int price;
	int stock;
	int categoryId;
	int supplierId;
	
	// Getter/Setter for Product Id
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	// Getter/Setter for ProductName
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	// Getter/Setter for Product Description
	public String getProdcutDesc() {
		return prodcutDesc;
	}
	
	public void setProdcutDesc(String prodcutDesc) {
		this.prodcutDesc = prodcutDesc;
	}
	
	
	// Getter/Setter for Product Price
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// Getter/Setter for Product Stock
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	// Getter/Setter for Category Id
	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
	// Getter/Setter for Product Stock
	public int getSupplierId() {
		return supplierId;
	}
	
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	
}
