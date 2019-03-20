package com.qa.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMap {
	@Autowired
	private INumGen numGen;

	public Map<String, Account> map = new HashMap<String, Account>();

	public void addAccount(Account account) {
		map.put(numGen.genNum(), account);
	}
	@Override
	public String toString() {
		return this.map.toString();
	}
}
