package com.example.sbtest.qualifier;

import org.springframework.stereotype.Service;

@Service
public class VisaService implements Card{
    @Override
    public String getInfo() {
        return "Visa Service";

    }
}
