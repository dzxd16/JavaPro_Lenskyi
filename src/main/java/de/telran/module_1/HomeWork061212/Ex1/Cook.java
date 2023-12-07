package de.telran.HomeWork061212.Ex1;

public class Cook implements Employee{
    @Override
    public void changeStatus(Order order) {
        order.setStatus(Status.COOKING);
    }
}
