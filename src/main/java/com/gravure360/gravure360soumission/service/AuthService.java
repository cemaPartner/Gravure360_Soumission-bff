package com.gravure360.gravure360soumission.service;

import com.gravure360.gravure360soumission.gateway.RoleRepository;
import com.gravure360.gravure360soumission.gateway.UserRepository;
import com.gravure360.gravure360soumission.model.auth.RegisterRequest;
import com.gravure360.gravure360soumission.model.auth.Role;
import com.gravure360.gravure360soumission.model.auth.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User register(RegisterRequest request) {
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setCompany(request.getCompany());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setPasswordHash(passwordEncoder.encode(request.getPasswordHash()));

        Role role = roleRepository.findByName("User");
        if (role == null) {
            throw new RuntimeException("Role not found");
        }
        user.setRole(role);

        return userRepository.save(user);
    }

    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user == null || !passwordEncoder.matches(password, user.getPasswordHash())) {
            throw new RuntimeException("Invalid username or password");
        }
        return user;
    }
}