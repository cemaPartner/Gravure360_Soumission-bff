package com.gravure360.gravure360soumission.model.auth;

public class RegisterRequest {
    private String username;
    private String password;
    private String role;

    public RegisterRequest(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public RegisterRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}