package com.example.sbtest.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {

   private ReloadableResourceBundleMessageSource messageSource;

    @Autowired
    public MessageService(ReloadableResourceBundleMessageSource messageSource) {
        this.messageSource = messageSource;
        String hello = messageSource.getMessage("hello", new Object[]{"Krzysztof","Kmiecik"}, Locale.forLanguageTag("de"));
        System.out.println(hello);
    }
}
