package com.telerikacademy.oop.contracts;

import com.telerikacademy.oop.models.Product;
import com.telerikacademy.oop.enums.Currency;

import java.time.LocalDate;
import java.util.ArrayList;

public interface Order {

    String getRecipient();

    Currency getCurrency();

    LocalDate getDeliveryOn();

    ArrayList<Product> getItems();

    void addItem(Product item);

    String displayOrderItems();

    String displayGeneralInfo();
}
