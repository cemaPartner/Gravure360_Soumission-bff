package com.gravure360.gravure360soumission.gateway;

import com.gravure360.gravure360soumission.model.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

