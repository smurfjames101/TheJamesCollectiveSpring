package com.qa.demo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountNumberGenerator {

	public String addChar() {
		int firstCharNum = ThreadLocalRandom.current().nextInt(0, 3);
		switch (firstCharNum) {
		case 0: {
			return "a";
		}
		case 1: {
			return "b";
		}
		case 2: {
			return "c";
		}
		default:
		{
			return "0";
		}
		}
	}

	public String genAccountNum10() {
		String accountString = addChar();
		for (int i = 0; i < 10; i++) {
			String digit = String.valueOf(ThreadLocalRandom.current().nextInt(0, 10));
			accountString += digit;
		}
		return accountString;
	}

	public String genAccountNum6() {
		String accountString = addChar();
		for (int i = 0; i < 6; i++) {
			String digit = String.valueOf((int) (Math.random() * 10));
			accountString += digit;
		}
		return accountString;
	}
	public String genAccountNum8() {
		String accountString = addChar();

		Random rand = new Random();
		int randNum = rand.nextInt(90000000)+ 10000000;
		accountString += "" + randNum;
		
		return accountString;
		
		
	}
}
