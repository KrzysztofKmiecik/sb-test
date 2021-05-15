package com.example.sbtest.qualifier;

import org.springframework.stereotype.Service;

@Service
public class MasterCardService implements Card{
    @Override
    public String getInfo() {
      return  "MasterCardService";

    }
}
