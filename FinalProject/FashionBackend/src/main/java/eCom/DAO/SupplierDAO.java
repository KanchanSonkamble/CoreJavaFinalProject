package eCom.DAO;

import java.util.List;

import eCom.Model.Supplier;

public interface SupplierDAO {
	
	public boolean addSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	
	public List<Supplier> listSupplier();
	
	public Supplier getSupplier(int supplierId);
	
}
