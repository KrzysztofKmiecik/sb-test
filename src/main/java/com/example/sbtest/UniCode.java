package com.example.sbtest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//https://www.fileformat.info/info/unicode/char/0142/index.htm

@Component
public class UniCode {
    @Value("${name}")
    String name;

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println(name);
    }

}
