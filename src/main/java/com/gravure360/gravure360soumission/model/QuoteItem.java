package com.gravure360.gravure360soumission.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "quote_item")
public class QuoteItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quoteId;
    private int materialId;
    private int height;
    private int width;
    private int quantity;
    private boolean adhesive;
    private String text;

    public QuoteItem() {
    }

    public QuoteItem(int id, int quoteId, int materialId, int height, int width, int quantity, boolean adhesive, String text) {
        this.id = id;
        this.quoteId = quoteId;
        this.materialId = materialId;
        this.height = height;
        this.width = width;
        this.quantity = quantity;
        this.adhesive = adhesive;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAdhesive() {
        return adhesive;
    }

    public void setAdhesive(boolean adhesive) {
        this.adhesive = adhesive;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
