package com.siferga.msAccounts.controller;

import com.siferga.msAccounts.model.Accounts;
import com.siferga.msAccounts.repository.AccountsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AccountsController {
    private final AccountsRepository accountsRepository;

    public AccountsController(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @PostMapping("/myAccount")
    public Accounts getAccountById(@RequestParam Integer id) {
        return accountsRepository.findById(id).get();
    }

   /* @PostMapping
    public Accounts createAccount(@PathVariable int id,@RequestBody Customer customer) {
        return accountsRepository.findById(id);

    }*/



}
