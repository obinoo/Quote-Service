package com.example.QuoteService.Repository;

import com.example.QuoteService.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends JpaRepository<Quote,Long> {

    List<Quote> findById(long id);

    List<Quote> findAll();



}
