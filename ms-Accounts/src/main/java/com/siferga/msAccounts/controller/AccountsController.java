package com.siferga.msAccounts.controller;

import com.siferga.msAccounts.model.Accounts;
import com.siferga.msAccounts.model.Customer;
import com.siferga.msAccounts.repository.AccountsRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountsController {
    private final AccountsRepository accountsRepository;

    public AccountsController(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        return accountsRepository.findByCustomerId(customer.getCustomerId());
    }





}
