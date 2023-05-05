package com.example.QuoteService.Service;

import com.example.QuoteService.Repository.QuoteRepository;
import com.example.QuoteService.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuoteService {



    @Autowired
    QuoteRepository quoteRepository;

     public List<Quote> QuoteId(long id){
         return quoteRepository.findById(id);
    }

    public List<Quote> AllQuote(){
        return quoteRepository.findAll();
    }

    public void Post(Quote quote){
         quoteRepository.save(quote);
    }
}
