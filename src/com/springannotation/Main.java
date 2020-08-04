package com.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext	(IocConfig.class);
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
		
//		ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
//		customerDal.add();

	}

}
