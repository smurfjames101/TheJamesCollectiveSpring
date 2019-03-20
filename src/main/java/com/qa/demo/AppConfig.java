package com.qa.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qa.demo.service.INumGen;
import com.qa.demo.service.NumGen10;

@Configuration
public class AppConfig {
	@Bean
	public INumGen genNum() {
		 return new NumGen10();
	}
}
