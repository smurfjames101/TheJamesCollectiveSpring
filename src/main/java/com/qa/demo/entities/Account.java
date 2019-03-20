package com.qa.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	private String firstName;
	private String secondName;
	private String accountNum;

	@Id
	@GeneratedValue
	private long id;

	public Account() {
	}

	public Account(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
		// this.accountNum = numGen.genNum();
	}

	public long getID() {
		return this.id;
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
