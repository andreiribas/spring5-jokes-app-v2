package com.ribas.andrei.spring5jokesapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public ChuckNorrisQuotes createChuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
