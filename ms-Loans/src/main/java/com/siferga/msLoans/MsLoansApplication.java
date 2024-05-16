package com.siferga.msLoans;

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
@ComponentScans({ @ComponentScan("com.siferga.msLoans.controller")})
@EnableJpaRepositories("com.siferga.msLoans.repository")
@EntityScan("com.siferga.msLoans.model")
public class MsLoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLoansApplication.class, args);
	}

}
