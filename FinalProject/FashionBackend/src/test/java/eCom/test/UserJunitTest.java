package eCom.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eCom.DAO.UserDAO;
import eCom.Model.UserDeatials;

public class UserJunitTest {
	
	static UserDAO userDAO;
	
	@BeforeClass
	public static void executeFirst(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("Ecommerce");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
		
		context.close();
	}

	@Test
	public void registerUserTest(){
		UserDeatials user = new UserDeatials();
		user.setUserName("Apana Bazar");
		user.setPassword("123456");
		user.setRole("Role_User");
		user.setEnabled(true);
		user.setCustomerName("Mahesh");
		user.setCustomerAddr("Mumbai");
		
		
		assertTrue("Problem in Registering User", userDAO.registerUser(user));
	}
}
