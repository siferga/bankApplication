package com.siferga.msLoans.repository;

import com.siferga.msLoans.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Integer> {
    List<Loans> findByCustomerId(int customerId);
}
