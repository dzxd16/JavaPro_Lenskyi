package de.telran.HomeWork061212.Ex1;

import java.util.LinkedHashSet;

public class Kitchen {
    public static void main(String[] args) {
        LinkedHashSet<Order> myOrders = new LinkedHashSet<>();
        myOrders.add(new Order("Первое",10));
        myOrders.add(new Order("Второе",15));
        myOrders.add(new Order("Компот",2));
        for (Order el: myOrders) {
            new Waiter().changeStatus(el);
            System.out.println(el.getName() + el.getStatus());
        }
        for (Order el: myOrders) {
            new Cook().changeStatus(el);
            System.out.println(el.getName() + el.getStatus());
        }

    }

}
