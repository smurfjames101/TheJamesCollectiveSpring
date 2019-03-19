package com.qa.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class accountMap {

	//@Scope("prototype")
	public Map<String, Account> maps = new HashMap<String, Account>();
	
	public void addAccount(ApplicationContext ac, int numLength) {
		maps.put(((AccountNumberGenerator)ac.getBean("accountNumberGenerator")).genAccountNum(numLength),((Account)ac.getBean("account")));
	}
}
