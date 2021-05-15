package com.example.sbtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CardServiceMain {
    Card card;

    @Autowired
    public CardServiceMain(@Qualifier("visaService") Card card) {
        this.card = card;
        String info=card.getInfo();
        System.out.println(info);
    }


}
