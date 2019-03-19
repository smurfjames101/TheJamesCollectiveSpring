package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TjcAccountsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(TjcAccountsApplication.class, args);
		AccountMap am = (AccountMap) ac.getBean("accountMap");
		INumGen numGen =(INumGen)ac.getBean("genNum");
		AccountBuilder accBuild = ((AccountBuilder) ac.getBean("accountBuilder")).getBuilder();
		
		am.addAccount(accBuild.accountNum(numGen.genNum()).accountBuild());
		am.addAccount(accBuild.accountNum(numGen.genNum()).accountBuild());
		am.addAccount(accBuild.accountNum(numGen.genNum()).accountBuild());
		am.addAccount(accBuild.accountNum(numGen.genNum()).accountBuild());
		am.addAccount(accBuild.accountNum(numGen.genNum()).accountBuild());
		System.out.println(am);

	}

}
