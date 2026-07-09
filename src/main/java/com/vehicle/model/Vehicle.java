package com.vehicle.model;

public class Vehicle {

    private int id;
    private String name;
    private String type;
    private double price;
    private String status;

    // Getter & Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}