package com.example.demo;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Component;

@Component
public class AccountNumberGenerator {
	private int accountNum;
	
	public  String genAccountNum(int digits) {
		String accountString="";
		
		for( int i = 0; i < digits;i++) {
			String digit =  String.valueOf(ThreadLocalRandom.current().nextInt(0,10));
			accountString+= digit;
		}
		return accountString;
	}
	
	public int getAccountNum() {
		return this.accountNum;
	}

}
