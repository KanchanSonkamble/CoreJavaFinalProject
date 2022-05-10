package eCom.test;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eCom.DAO.CategoryDAO;
import eCom.Model.Category;

public class CategoryJunitTest {

	@Autowired
	static CategoryDAO categoryDAO;

	@BeforeClass
	
	public static void excuteFirst() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("Ecommerce");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
		context.close();
		
	}

	
	@Test
	public void addCategoryTest(){
		Category category = new Category();
		
		category.setCategoryName("T-Shirt");
		category.setCategoryDesc("All Variety of Cootton T-Shirt");
		
		assertTrue("Problem In Adding Category", categoryDAO.addCategory(category));
	}
}
