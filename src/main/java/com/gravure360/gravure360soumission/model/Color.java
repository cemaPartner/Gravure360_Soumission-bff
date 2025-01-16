package com.gravure360.gravure360soumission.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "color")
public class Color {
    @Id
    private int id;
    private String nameFr;
    private String nameEn;
    private String hex;

    public Color() {
    }

    public Color(int id, String nameFr, String nameEn, String hex) {
        this.id = id;
        this.nameFr = nameFr;
        this.nameEn = nameEn;
        this.hex = hex;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}
