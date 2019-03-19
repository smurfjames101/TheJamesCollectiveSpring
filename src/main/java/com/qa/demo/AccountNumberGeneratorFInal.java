package com.qa.demo;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Component;

@Component
public class AccountNumberGeneratorFInal {

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
}
