package com.niit.ShoppingCart;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCart.dao.UserDetailsDAO;
import com.niit.ShoppingCart.model.UserDetails;

public class UserDetailsTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	UserDetailsDAO UserDetailsDAO=(UserDetailsDAO) context.getBean("userDetailsDAO");
	UserDetails UserDetails=(UserDetails) context.getBean("userDetails");
	UserDetails.setId("USD001");
	UserDetails.setName("USDName001");
	UserDetails.setDescription("USD001 descri");
	if (UserDetailsDAO.save(UserDetails)==true) 
	{
		System.out.println("UserDetails created successfully");
		
	} else {
		System.out.println("cannot create userDetails");

	}
}
}
