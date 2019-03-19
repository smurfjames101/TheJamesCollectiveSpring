package com.example.demo;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Component;

@Component
public class AccountNumberGenerator {

	public  String genAccountNum(int digits) {
		String accountString="";
			
		int firstCharNum =ThreadLocalRandom.current().nextInt(0,3);
			switch(firstCharNum) {
			case 0:
				accountString+="a";
			case 1:
				accountString+="b";
			case 2:
				accountString+="c";
			}
	
		for( int i = 0; i < digits;i++) {
			String digit =  String.valueOf(ThreadLocalRandom.current().nextInt(0,10));
			accountString+= digit;
		}
		return accountString;
	}
}
