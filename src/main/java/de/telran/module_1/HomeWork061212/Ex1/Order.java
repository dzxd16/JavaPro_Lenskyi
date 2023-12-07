package de.telran.HomeWork061212.Ex1;

public class Order {
    private String name;
    private int price;
    private Status status;


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Order(String name, int price) {
        this.name = name;
        this.price = price;


    }


}
