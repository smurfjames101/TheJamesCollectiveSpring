package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TjcAccountsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(TjcAccountsApplication.class, args);
		AccountMap am = (AccountMap) ac.getBean("accountMap");
		am.addAccount(new Account());
		System.out.println(am);
	}

}
