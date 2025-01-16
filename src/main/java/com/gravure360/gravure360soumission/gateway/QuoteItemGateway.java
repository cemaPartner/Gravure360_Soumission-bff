package com.gravure360.gravure360soumission.gateway;

import com.gravure360.gravure360soumission.model.QuoteItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuoteItemGateway extends JpaRepository<QuoteItem, Long> {
    List<QuoteItem> findByQuoteId(Long quoteId);
}
