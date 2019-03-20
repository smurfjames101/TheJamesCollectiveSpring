package com.qa.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NumGen10 implements INumGen {
	private List<String> accountNums = new ArrayList<String>();

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
		String accountString = null;
		Boolean newCheck = true;
		while (newCheck) {
			accountString = addChar();
			for (int i = 0; i < 10; i++) {
				String digit = String.valueOf(ThreadLocalRandom.current().nextInt(0, 10));
				accountString += digit;
			}
			newCheck = accountNums.contains(accountString);
		}
		return accountString;
	}
}
