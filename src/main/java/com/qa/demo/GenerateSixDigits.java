package com.example.demo;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class GenerateSixDigits {

	public  String genSixDig() {
		String accountString="";
			
		int firstCharNum =ThreadLocalRandom.current().nextInt(0,3);
			switch(firstCharNum) {
			case 0:
				accountString+="a";
				break;
			case 1:
				accountString+="b";
				break;
			case 2:
				accountString+="c";
				break;
			}
	
		for( int i = 0; i < 6;i++) {
			String digit =  String.valueOf((int)(Math.random() * 10));
			accountString+= digit;
		}
		return accountString;
	}

}