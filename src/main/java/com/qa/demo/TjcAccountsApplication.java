package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.qa.demo.entities.Account;

@SpringBootApplication
@EnableWebMvc
public class TjcAccountsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(TjcAccountsApplication.class, args);
	}

}
