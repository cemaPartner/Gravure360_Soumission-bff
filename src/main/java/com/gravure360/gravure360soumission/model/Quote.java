package com.gravure360.gravure360soumission.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "quote")
public class Quote {
    @Id
    private int id;
    private String name;
    private String description;
    private Date date;
    private int userId;

    public Quote() {
    }

    public Quote(int id, String name, String description, Date date, int userId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
