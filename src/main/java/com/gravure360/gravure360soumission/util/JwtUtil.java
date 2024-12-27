package com.gravure360.gravure360soumission.util;

import com.gravure360.gravure360soumission.model.auth.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    // Injecting secret key and expiration time from application.properties or application.yml
    @Value("${jwt.secret}")
    private String secretKey;

    @Value("${jwt.expiration}")
    private long expirationTime;  // in milliseconds

    /**
     * Generates a JWT token with a subject (username) and role claim.
     * @param email The username for which the token is generated.
     * @param role The role associated with the user.
     * @return A JWT token.
     */
    public String generateToken(User user) {
        return Jwts.builder()
                .claim("email", user.getEmail())
                .claim("id", user.getId())
                .claim("role", user.getRole())
                .claim("firstName", user.getFirstName())
                .claim("lastName", user.getLastName())
                .claim("company", user.getCompany())
                .claim("phone", user.getPhone())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    /**
     * Extracts claims from a JWT token.
     * @param token The JWT token.
     * @return The claims contained in the token.
     */
    public Claims extractClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * Validates whether the token is still valid based on the username and expiration.
     * @param token The JWT token.
     * @param username The username to check.
     * @return True if the token is valid, false otherwise.
     */
    public boolean isTokenValid(String token, String username) {
        return username.equals(extractClaims(token).getSubject()) && !isTokenExpired(token);
    }

    /**
     * Checks if the token is expired.
     * @param token The JWT token.
     * @return True if the token is expired, false otherwise.
     */
    private boolean isTokenExpired(String token) {
        return extractClaims(token).getExpiration().before(new Date());
    }
}
