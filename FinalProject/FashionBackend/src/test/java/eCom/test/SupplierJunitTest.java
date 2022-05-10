package eCom.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eCom.DAO.SupplierDAO;
import eCom.Model.Supplier;


public class SupplierJunitTest {

	static SupplierDAO supplierDAO;
	
	@BeforeClass
	public static void excuteFirst(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("Ecommerce");
		context.refresh();
		
		supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		
	}

	@Test
	public void addSupplierTest(){
		
		Supplier supplier = new Supplier();
		
		supplier.setSupplierId(5);
		supplier.setSupplierName("Levis");
		supplier.setSuppierAddr("New Delhi");
		

		assertTrue("Problem in Adding Supplier", supplierDAO.addSupplier(supplier));
	}
}
