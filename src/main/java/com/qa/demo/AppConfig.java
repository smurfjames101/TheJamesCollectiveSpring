package com.qa.demo;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.qa.demo.service.INumGen;
import com.qa.demo.service.NumGen10;
import com.qa.demo.service.NumGen6;
import com.qa.demo.service.NumGen8;

@Configuration
public class AppConfig {
	@Bean
	@Scope("singleton")
	public INumGen genNum() {
		int whichGen =ThreadLocalRandom.current().nextInt(3); 
		switch(whichGen) {
		case 0:
			return new NumGen10();
		case 1:
			return new NumGen8();
		case 2:
			return new NumGen6();
		default: 
			return new NumGen10();	
		}
	}
}
