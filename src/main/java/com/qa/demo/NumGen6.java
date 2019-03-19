package com.qa.demo;

import java.util.concurrent.ThreadLocalRandom;

public class NumGen6 implements INumGen {
	
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
		default: {
			return "0";
		}
		}
	}
	
	@Override
	public String genNum() {
		String accountString = addChar();
		for (int i = 0; i < 6; i++) {
			String digit = String.valueOf((int) (Math.random() * 10));
			accountString += digit;
		}
		return accountString;
	}

	
}
