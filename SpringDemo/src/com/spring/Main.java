package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator generator = context.getBean("wmg", WishMessageGenerator.class);

		String message = generator.showWishMessage("Faizan");
		
		System.out.println(message);

	}

}
