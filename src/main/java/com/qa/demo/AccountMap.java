package com.qa.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AccountMap {
	public Map<String, Account> map = new HashMap<String, Account>();

	public void addAccount(Account account) {
		map.put(account.getAccountNum(), account);
	}

	@Override
	public String toString() {
		String outString = "";
		String[] list = new String[map.size()];
		map.keySet().toArray(list);
		for (int i = 0; i < map.size(); i++) {
			outString += "Account " + (i + 1) + ": " + list[i] + "\n";
		}
		return outString;
	}
}
