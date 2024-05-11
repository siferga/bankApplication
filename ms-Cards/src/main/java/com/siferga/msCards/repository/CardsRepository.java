package com.siferga.msCards.repository;

import com.siferga.msCards.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Integer> {
    Cards findByCustomerId(int customerId);
}
