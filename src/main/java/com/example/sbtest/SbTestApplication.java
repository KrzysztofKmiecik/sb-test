package com.example.sbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SbTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbTestApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sayHello(){
        System.out.println("Hello world");
    }

}
