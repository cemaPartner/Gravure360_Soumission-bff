package com.gravure360.gravure360soumission.gateway;

import com.gravure360.gravure360soumission.model.Quote;
import com.gravure360.gravure360soumission.model.QuoteItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuoteGateway extends JpaRepository<Quote, Long> {
    List<Quote> findByUserId(Long userId);
}
