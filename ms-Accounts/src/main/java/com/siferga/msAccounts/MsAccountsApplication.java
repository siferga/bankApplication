package com.siferga.msAccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
@RefreshScope
//to scan a component when not in a conventional folder.
//@ComponentScans({ @ComponentScan("com.siferga.msAccounts.controller")})
@EnableJpaRepositories("com.siferga.msAccounts.repository")
@EntityScan("com.siferga.msAccounts.model")
public class MsAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAccountsApplication.class, args);
	}

}
