package com.evoke.demo.setterandconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BrandedProducts obj = (BrandedProducts) context.getBean("product");
		obj.getproduct();

	}
}
