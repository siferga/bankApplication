package com.siferga.msLoans.controller;

import com.siferga.msLoans.model.Customer;
import com.siferga.msLoans.model.Loans;
import com.siferga.msLoans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {

    private final LoansRepository loansRepository;

    public LoansController(LoansRepository loansRepository) {
        this.loansRepository = loansRepository;
    }

    @PostMapping("/myLoans")
    public List<Loans> getLoansDetails(@RequestBody Customer customer) {
        List<Loans> Loans = loansRepository.findByCustomerId(customer.getCustomerId());
        return Loans;
    }
}



