package com.qa.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumGen8 implements INumGen {
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

			Random rand = new Random();
			int randNum = rand.nextInt(90000000) + 10000000;
			accountString += "" + randNum;
			newCheck = accountNums.contains(accountString);
		}
		return accountString;
	}

}
