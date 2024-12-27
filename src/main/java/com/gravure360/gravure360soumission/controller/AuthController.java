package com.gravure360.gravure360soumission.controller;

import com.gravure360.gravure360soumission.model.auth.JwtResponse;
import com.gravure360.gravure360soumission.model.auth.LoginRequest;
import com.gravure360.gravure360soumission.model.auth.RegisterRequest;
import com.gravure360.gravure360soumission.model.auth.User;
import com.gravure360.gravure360soumission.service.AuthService;
import com.gravure360.gravure360soumission.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody LoginRequest request) {
        User user = authService.login(request.getUsername(), request.getPassword());
        return new ResponseEntity<>(new JwtResponse(jwtUtil.generateToken(user)), HttpStatus.OK);
    }

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }
}