package com.gravure360.gravure360soumission.controller;

import com.gravure360.gravure360soumission.gateway.QuoteGateway;
import com.gravure360.gravure360soumission.model.Quote;
import com.gravure360.gravure360soumission.model.QuoteItem;
import com.gravure360.gravure360soumission.service.QuoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quote")
public class QuoteControlller {
    private QuoteService quoteService;
    private final QuoteGateway quoteGateway;

    public QuoteControlller(QuoteService quoteService, QuoteGateway quoteGateway) {
        this.quoteService = quoteService;
        this.quoteGateway = quoteGateway;
    }

    @GetMapping("/get")
    public List<Quote> getQuotes() {
        return quoteGateway.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<List<Quote>> addQuote(@RequestBody Quote quote) {
        quoteGateway.save(quote);

        return new ResponseEntity<>(quoteGateway.findAll(), HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Quote>> getQuotesByUserId(@PathVariable Long userId) {
        List<Quote> quotes = quoteService.findQuotesByUserId(userId);
        if (quotes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(quotes, HttpStatus.OK);
    }
}
