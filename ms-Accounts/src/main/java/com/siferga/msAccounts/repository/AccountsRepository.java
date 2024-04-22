package com.siferga.msAccounts.repository;

import com.siferga.msAccounts.model.Accounts;
import com.siferga.msAccounts.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Integer> {

}
