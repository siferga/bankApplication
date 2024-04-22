package com.siferga.msAccounts.repository;

import com.siferga.msAccounts.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Customer, Integer> {

}
