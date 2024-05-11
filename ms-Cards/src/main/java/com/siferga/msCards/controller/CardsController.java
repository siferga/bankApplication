package com.siferga.msCards.controller;

import com.siferga.msCards.model.Cards;
import com.siferga.msCards.model.Customer;
import com.siferga.msCards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    private final CardsRepository cardsRepository;

    public CardsController(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    @PostMapping("/myCards")
    public List<Cards> getCardsDetails(@RequestBody Customer customer) {
         List<Cards> Cards = cardsRepository.findByCustomerId(customer.getCustomerId());
        return Cards;
    }


}
