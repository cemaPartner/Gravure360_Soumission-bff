package com.gravure360.gravure360soumission.gateway;

import com.gravure360.gravure360soumission.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorGateway extends JpaRepository<Color, Long> {
}
