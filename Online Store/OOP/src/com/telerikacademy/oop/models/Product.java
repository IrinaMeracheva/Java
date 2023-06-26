package com.telerikacademy.oop.models;

import com.telerikacademy.oop.enums.Currency;

public class Product {

    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 15;

    private String name;
    private double price;
    private final Currency currency = Currency.EUR;

    public Product(String name, double price, Currency currency) {
        setName(name);
        setPrice(price);
    }

    public Product(String name, double price) {
        this(name, price, Currency.EUR);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    private void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format("Product name must be between %d and %d characters.",
                    MIN_NAME_LENGTH, MAX_NAME_LENGTH));
        }
        this.name = name;
    }

    private void setPrice(double price) {
        if (price <= 0.0) {
            throw new IllegalArgumentException("Product price must be positive.");
        }
        this.price = price;
    }

    public String getDisplayInfo(){
        return String.format("%s -%.2f %s", getName(), getPrice(), getCurrency());
    }
}
