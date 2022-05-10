package eCom.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class UserDeatials {
	
	@Id
	String userName;
	String password;
	String role;
	boolean enabled;
	String customerName;
	String customerAddr;
	
	
	// Getter/Setter Method for User Name
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	// Getter/Setter Method for Password
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	// Getter/Setter Method for Role
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	// Getter/Setter Method for Boolean enabled
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	// Getter/Setter Method for Customer Name
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	// Getter/Setter Method for Customer Addr
	public String getCustomerAddr() {
		return customerAddr;
	}
	
	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}
}
