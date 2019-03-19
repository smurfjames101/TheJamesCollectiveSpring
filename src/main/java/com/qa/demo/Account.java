package com.qa.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Account {
	private String firstName;
	private String secondName;
	private String accountNum;
	
	public Account(String firstName, String secondName, String accountNum) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.accountNum = accountNum;
	}
	
	public Account(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	
}
