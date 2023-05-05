package com.example.QuoteService.Controller;

import com.example.QuoteService.Repository.QuoteRepository;
import com.example.QuoteService.Service.QuoteService;
import com.example.QuoteService.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    @Autowired
    QuoteService service;

    @Autowired
    QuoteRepository repository;

    private final Random random = new Random();


//   "endpoint  to get all the quotes that are available
    @GetMapping("/quotes")
    public List <Quote> getAll(){

        return service.AllQuote();
    }

    // endpoint "/api/{id}" is used to get specific quotes.
    @GetMapping("/quotes/{id}")
    public List<Quote> getById(@PathVariable("id") Long id) {

        return service.QuoteId(id);

    }

//   "This endpoint /api/random" this helps to get random quotes.
    @GetMapping("/quotes/random")
        public List<Quote> getRandomQuotes(){

       return
               getById(random.nextLong(1, repository.count() + 1));
        }

        //This enables you to post some quotes
        @PostMapping("quotes/post")
        public void postQuotes(Quote quote){

        service.Post(quote);

        }
}
