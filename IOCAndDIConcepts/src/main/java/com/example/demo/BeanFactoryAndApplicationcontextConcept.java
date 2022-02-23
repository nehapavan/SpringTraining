package com.example.demo;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryAndApplicationcontextConcept {
	public static void main(String[] args) {
		
//		Resource resobj = (Resource) new ClassPathResource("applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resobj);
//		App bean = (App) factory.getBean("App2");
//		bean.getAppInfo();
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		App obj = (App) context.getBean("App1");
//		obj.getAppInfo();
		
		
		App appObj = new Facebook();
		appObj.getAppInfo();

		
		

	}
}
