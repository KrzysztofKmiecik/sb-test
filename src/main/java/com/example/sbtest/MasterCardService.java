package com.example.sbtest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class MasterCardService implements Card{
    @Override
    public String getInfo() {
      return  "MasterCardService";

    }
}
