package eCom.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier {

	@Id
	@GeneratedValue

	int supplierId;
	String supplierName;
	String supplierAddr;

	// Getter/Setter for Supplier ID
	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	
	// Getter/Setter for Supplier Name
	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	
	// Getter/Setter for Supplier Address
	public String getSuppierAddr() {
		return getSuppierAddr();
	}


	public void setSuppierAddr(String suppierAddr) {
		this.supplierAddr = suppierAddr;
	}

}
