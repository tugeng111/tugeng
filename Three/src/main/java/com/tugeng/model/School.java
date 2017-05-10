package com.tugeng.model;

import java.math.BigDecimal;

public class School {
    private Integer id;

    private String name;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Byte crawled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Byte getCrawled() {
        return crawled;
    }

    public void setCrawled(Byte crawled) {
        this.crawled = crawled;
    }
}