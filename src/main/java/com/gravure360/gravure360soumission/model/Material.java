package com.gravure360.gravure360soumission.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "material")
public class Material {
    @Id
    private String name;
    private String brand;
    private int height;
    private int width;
    private int backgroundColorId;
    private int engravingColorId;
    private int thickness;
    private int price;
    private boolean adhesive;
    private int stock;

    public Material() {
    }

    public Material(String name, String brand, int height, int width, int backgroundColorId, int engravingColorId, int thickness, int price, boolean adhesive, int stock) {
        this.name = name;
        this.brand = brand;
        this.height = height;
        this.width = width;
        this.backgroundColorId = backgroundColorId;
        this.engravingColorId = engravingColorId;
        this.thickness = thickness;
        this.price = price;
        this.adhesive = adhesive;
        this.stock = stock;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAdhesive() {
        return adhesive;
    }

    public void setAdhesive(boolean adhesive) {
        this.adhesive = adhesive;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBackgroundColorId() {
        return backgroundColorId;
    }

    public void setBackgroundColorId(int backgroundColorId) {
        this.backgroundColorId = backgroundColorId;
    }

    public int getEngravingColorId() {
        return engravingColorId;
    }

    public void setEngravingColor(int engravingColorId) {
        this.engravingColorId = engravingColorId;
    }
}
