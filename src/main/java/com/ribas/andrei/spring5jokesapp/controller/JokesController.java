package com.ribas.andrei.spring5jokesapp.controller;

import com.ribas.andrei.spring5jokesapp.service.ChuckNorrisQuoteRetriever;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisQuoteRetriever chuckNorrisQuoteRetriever;

    public JokesController(final ChuckNorrisQuoteRetriever chuckNorrisQuoteRetriever) {
        this.chuckNorrisQuoteRetriever = chuckNorrisQuoteRetriever;
    }

    @GetMapping("/")
    public String getQuote(final Model model) {
        model.addAttribute("quote", this.chuckNorrisQuoteRetriever.getQuote());
        return "index";
    }

}
