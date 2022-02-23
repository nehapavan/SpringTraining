package com.evoke.demo.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.DependencyConcepts.ProductCompany;

public class ScopesConcept {
	
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	ProductCompany obj = (ProductCompany) context.getBean("ProductCompany");
	System.out.println(obj.hashCode());
	ProductCompany obj1 = (ProductCompany) context.getBean("ProductCompany");
	System.out.println(obj1.hashCode());
	
//	App appObj = new Facebook();
//	obj.getAppInfo();

}
}
