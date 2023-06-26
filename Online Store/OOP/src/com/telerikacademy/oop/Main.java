package com.telerikacademy.oop;

import com.telerikacademy.oop.contracts.Order;
import com.telerikacademy.oop.enums.Currency;
import com.telerikacademy.oop.models.DomesticOrder;
import com.telerikacademy.oop.models.InternationalOrder;
import com.telerikacademy.oop.models.Product;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Order order1 = new DomesticOrder("John",
                Currency.BGN,
                LocalDate.now());

        order1.addItem(new Product("Keyboard", 50));
        order1.addItem(new Product("Monitor", 100));

        Order order2 = new DomesticOrder("Frank",
                Currency.EUR,
                LocalDate.of(2023, Month.AUGUST, 30));

        order2.addItem(new Product("T-shirt", 10));
        order2.addItem(new Product("Jeans", 20));

        Order order3 = new InternationalOrder("Anna",
                Currency.EUR,
                LocalDate.now(),
                "DHL",
                20);

        order3.addItem(new Product("Backpack", 16));
        order3.addItem(new Product("Speakers", 90));

        Order[] orders = new Order[]{order1, order2, order3};

        for (Order order: orders) {
            System.out.println(order.displayGeneralInfo());
            System.out.println(order.displayOrderItems());
        }
    }
}
