package com.ribas.andrei.spring5jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteRetrieverImpl implements ChuckNorrisQuoteRetriever {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuoteRetrieverImpl(final ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getQuote() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }

}
