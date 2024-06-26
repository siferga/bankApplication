package com.siferga.msAccounts.repository;

import com.siferga.msAccounts.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Integer> {
    Accounts getAccountsByCustomerId(int customerId);

}



