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

@RestController
public class AccountController {

	private AccountService accountService;

	@Autowired
	RestTemplateBuilder rtb; 

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@PostMapping("/createAccount")
	public String createAccount(Account account) {
		this.accountService.createAccount(account);
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