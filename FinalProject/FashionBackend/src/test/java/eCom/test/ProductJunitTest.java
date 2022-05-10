package eCom.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eCom.DAO.ProductDAO;
import eCom.Model.Product;

public class ProductJunitTest {

	@Autowired
	static ProductDAO productDAO;

	@BeforeClass
	public static void excuteFirst() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("Ecommerce");
		context.refresh();
		
		productDAO = (ProductDAO)context.getBean("productDAO");
		
		context.close();
	}
	
	@Test
	public void addProductTest(){
		Product product = new Product();
		product.setProductName("T-Shirt");
		product.setProdcutDesc("Levis Sky Blue Coller T-Shirt ");
		product.setPrice(1399);
		product.setStock(50);
		product.setCategoryId(18);
		product.setSupplierId(15);
		
		assertTrue("Problem in Adding Product", productDAO.addProduct(product));
	}
}
