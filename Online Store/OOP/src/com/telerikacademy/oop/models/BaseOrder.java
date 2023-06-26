package com.telerikacademy.oop.models;

import com.telerikacademy.oop.contracts.Order;
import com.telerikacademy.oop.enums.Currency;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseOrder implements Order {

    private static final int MIN_RECIPIENT_LENGTH = 3;
    private static final int MAX_RECIPIENT_LENGTH = 35;
    private static final int BGN_EUR_CONVERSION_RATE = 2;

    private String recipient;
    private Currency currency;
    private LocalDate deliveryOn;
    private List<Product> items;

    public BaseOrder(String recipient, Currency currency,
                     LocalDate deliveryOn) {
        setRecipient(recipient);
        setCurrency(currency);
        setDeliveryOn(deliveryOn);
        this.items = new ArrayList<>();
    }

    public String getRecipient() {
        return recipient;
    }

    public Currency getCurrency() {
        return currency;
    }

    public LocalDate getDeliveryOn() {
        return deliveryOn;
    }

    public ArrayList<Product> getItems() {
        return new ArrayList<>(items);
    }

    private void setRecipient(String recipient) {
        if (recipient == null) {
            throw new IllegalArgumentException("Recipient cannot be empty.");
        }
        if (recipient.length() < MIN_RECIPIENT_LENGTH || recipient.length() > MAX_RECIPIENT_LENGTH) {
            throw new IllegalArgumentException(String.format("Recipient name must be between %d and %d characters.",
                    MIN_RECIPIENT_LENGTH, MAX_RECIPIENT_LENGTH));
        }
        this.recipient = recipient;
    }

    private void setCurrency(Currency currency) {
        this.currency = currency;
    }

    private void setDeliveryOn(LocalDate deliveryOn) {
        this.deliveryOn = deliveryOn;
    }

    public void addItem(Product item) {
        if (getItems().contains(item)) {
            throw new IllegalArgumentException("This item is already in this order");
        }
        items.add(item);
    }

    private double calculateTotalPrice() {
        double total = 0;

        for (Product product : items) {
            total += product.getPrice();
        }
        if (currency == Currency.EUR) {
            total *= BGN_EUR_CONVERSION_RATE;
        }
        return total;
    }

    public String displayOrderItems() {
        if (items.size() == 0) {
            return "No items";
        }
        StringBuilder sb = new StringBuilder();
        for (Product item: items) {
            sb.append(String.format("  %s%n", item.getDisplayInfo()));
        }
        sb.append("----------------------------------------------");

        return sb.toString();
    }
    public String displayGeneralInfo() {
        return String.format(
                "%s Order to: %s | Delivery on: %s | Total: %s",
                getOrderType(),
                recipient,
                formatDeliveryDate(),
                formatPrice());
    }
    private String formatDeliveryDate() {
        return deliveryOn.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }
    private String formatPrice() {
        return String.format("%.2f BGN", calculateTotalPrice());
    }
    protected abstract String getOrderType();
}
