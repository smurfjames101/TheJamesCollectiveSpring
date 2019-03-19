package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TjcAccountsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(TjcAccountsApplication.class, args);
		System.out.println(((AccountNumberGenerator) ac.getBean("accountNumberGenerator")).genAccountNum(8));
		//TODO Add Correct Hash map bean name
		//System.out.println(ac.getBean("HashMap"));
		
	}

}
