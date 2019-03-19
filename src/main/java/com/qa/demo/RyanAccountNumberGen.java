package com.qa.demo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RyanAccountNumberGen {
	private int accountNum;
	
	public String getAccountNum() {
		String accountString = "";
		
		int firstChar = ThreadLocalRandom.current().nextInt(0,3);
		switch (firstChar) {
		case 0:
			accountString +="a";
		case 1:
			accountString +="b";
		case 2:
			accountString +="c";
		}
		
		Random rand = new Random();
		int randNum = rand.nextInt(90000000)+ 10000000;
		accountString += "" + randNum;
		
		System.out.println((accountString));
		return accountString;
		
		
	}
	
}
