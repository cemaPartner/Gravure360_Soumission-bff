package com.gravure360.gravure360soumission.service;

import com.gravure360.gravure360soumission.gateway.QuoteGateway;
import com.gravure360.gravure360soumission.gateway.QuoteItemGateway;
import com.gravure360.gravure360soumission.model.Quote;
import com.gravure360.gravure360soumission.model.QuoteItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {

    private final QuoteGateway quoteGateway;

    public QuoteService(QuoteGateway quoteGateway) {
        this.quoteGateway = quoteGateway;
    }

    public List<Quote> findQuotesByUserId(Long userId) {
        return quoteGateway.findByUserId(userId);
    }
}