package com.gravure360.gravure360soumission.model.auth;

public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String company;
    private String passwordHash;
    private String email;
    private String phone;


    public RegisterRequest(String firstName, String lastName, String company, String passwordHash, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.passwordHash = passwordHash;
        this.email = email;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}