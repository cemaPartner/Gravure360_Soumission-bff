package com.gravure360.gravure360soumission.gateway;

import com.gravure360.gravure360soumission.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialGateway extends JpaRepository<Material, Long> {
}
