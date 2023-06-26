package com.telerikacademy.oop.models;

import com.telerikacademy.oop.enums.Currency;

import java.time.LocalDate;

public class InternationalOrder extends BaseOrder {

    private static final int MAX_PRODUCTS_LIMIT = 5;
    private static final String ERROR_MESSAGE_PRODUCTS_LIMIT = "International orders are limited to %d products";

    private String carrier;
    private int customsPercentage;

    public InternationalOrder(String recipient, Currency currency, LocalDate deliveryOn, String carrier,
                              int customsPercentage) {
        super(recipient, currency, deliveryOn);
        setCarrier(carrier);
        setCustomsPercentage(customsPercentage);
    }

    public String getCarrier() {
        return carrier;
    }

    public int getCustomsPercentage() {
        return customsPercentage;
    }

    private void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    private void setCustomsPercentage(int customsPercentage) {
        this.customsPercentage = customsPercentage;
    }

    @Override
    public String displayGeneralInfo() {
        return String.format("%s | Carrier: %s | *NOTE* - customs of %d%% expected but to be calculated in arrival.",
                super.displayGeneralInfo(),
                getCarrier(),
                getCustomsPercentage());
    }

    @Override
    protected String getOrderType() {
        return "International";
    }

    @Override
    public void addItem(Product item) {
        if (getItems().size() >= MAX_PRODUCTS_LIMIT) {
            throw new IllegalArgumentException(String.format(ERROR_MESSAGE_PRODUCTS_LIMIT, MAX_PRODUCTS_LIMIT));
        }
        super.addItem(item);
    }
}
