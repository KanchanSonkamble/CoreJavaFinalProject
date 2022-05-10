package eCom.test;


import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class GeneralTest {

	public static void main(String []args){
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		
		context.scan("Ecommerce");
		context.refresh();
	}

}
