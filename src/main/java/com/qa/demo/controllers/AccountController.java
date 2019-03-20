package com.qa.demo.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.qa.demo.entities.Account;
import com.qa.demo.service.AccountService;
import com.qa.demo.service.INumGen;

@RestController
public class AccountController {

	private AccountService accountService;
	
	private INumGen numGen;

	private RestTemplateBuilder rtb; 


	public AccountController(AccountService accountService, INumGen numGen, RestTemplateBuilder rtb) {
		this.accountService = accountService;
		this.numGen = numGen;
		this.rtb = rtb;
	}

	@PostMapping("/createAccount")
	public String createAccount(String firstName, String secondName) {
		Account acc = new Account(firstName, secondName);
		acc.setAccountNum(this.numGen.genNum());
		this.accountService.createAccount(acc);
		return "Account Created";
	}

	@GetMapping
	public Collection<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}

	@GetMapping("/hello")
	public String giveHello() {
		return rtb.build().exchange("http://localhost:8890/hello",HttpMethod.GET, null, String.class).getBody();
	}
	
	
}