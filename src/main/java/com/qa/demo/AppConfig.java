package com.qa.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public INumGen genNum() {
		 return new NumGen10();
	}
}
