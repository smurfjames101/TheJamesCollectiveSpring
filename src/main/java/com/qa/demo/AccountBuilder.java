package com.qa.demo;

import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class AccountBuilder {
	private String firstName = "";
	private String secondName = "";
	private String accountNum = "";
	private static AccountBuilder accountBuilder;
	
	private AccountBuilder() {	
	}

	public AccountBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public AccountBuilder secondName(String secondName) {
		this.secondName = secondName;
		return this;
	}
	
	public AccountBuilder accountNum(String accountNum) {
		this.accountNum = accountNum;
		return this;
	}
	
	public Account accountBuild() {
		Account account = new Account(Optional.ofNullable(this.firstName).orElse("N/A"),
				Optional.ofNullable(this.secondName).orElse("N/A"),
				Optional.ofNullable(this.accountNum).orElse("N/A"));
		accountBuilder = null;
		return account;
	}
	
	public static AccountBuilder getBuilder() {
		if(accountBuilder== null) {
			accountBuilder = new AccountBuilder();
		}
		return accountBuilder;
	}

}
