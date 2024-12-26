package com.gravure360.gravure360soumission.gateway;

import com.gravure360.gravure360soumission.model.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
