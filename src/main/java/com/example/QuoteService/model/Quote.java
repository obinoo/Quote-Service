package com.example.QuoteService.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "quote")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "quote_text", unique = true, nullable = false)
    private String QuoteText;

    @Column(name = "quote_author", unique = true, nullable = false)
    private String QuoteAuthor;


}
