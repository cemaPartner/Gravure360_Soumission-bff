package com.gravure360.gravure360soumission.controller;

import com.gravure360.gravure360soumission.gateway.QuoteGateway;
import com.gravure360.gravure360soumission.gateway.QuoteItemGateway;
import com.gravure360.gravure360soumission.model.Quote;
import com.gravure360.gravure360soumission.model.QuoteItem;
import com.gravure360.gravure360soumission.service.QuoteItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quote_item")
public class QuoteItemControlller {

    private final QuoteItemService quoteItemService;
    private final QuoteItemGateway quoteItemGateway;

    public QuoteItemControlller(QuoteItemService quoteItemService,QuoteItemGateway quoteItemGateway) {
        this.quoteItemService = quoteItemService;
        this.quoteItemGateway = quoteItemGateway;
    }

    @PostMapping("/add")
    public ResponseEntity<List<QuoteItem>> addQuoteItem(@RequestBody QuoteItem quoteItem) {
        quoteItemGateway.save(quoteItem);

        return new ResponseEntity<>(quoteItemService.findItemsByQuoteId(Long.valueOf(quoteItem.getQuoteId())), HttpStatus.CREATED);
    }

    @GetMapping("/{quoteId}")
    public ResponseEntity<List<QuoteItem>> getItemsByQuoteId(@PathVariable Long quoteId) {
        List<QuoteItem> quoteItems = quoteItemService.findItemsByQuoteId(quoteId);
        if (quoteItems.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(quoteItems, HttpStatus.OK);
    }
}
