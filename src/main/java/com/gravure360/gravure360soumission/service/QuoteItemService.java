package com.gravure360.gravure360soumission.service;

import com.gravure360.gravure360soumission.gateway.QuoteItemGateway;
import com.gravure360.gravure360soumission.model.QuoteItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteItemService {

    private final QuoteItemGateway quoteItemGateway;

    public QuoteItemService(QuoteItemGateway quoteItemGateway) {
        this.quoteItemGateway = quoteItemGateway;
    }

    public List<QuoteItem> findItemsByQuoteId(Long quoteId) {
        return quoteItemGateway.findByQuoteId(quoteId);
    }
}