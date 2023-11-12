package de.telran.HomeWork2.Exercise2;

public class SimpleVehicle {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setType("Electro");
        bike.setSpeed(40);
        System.out.println(bike);

        Bus bus = new Bus();
        bus.setNumber("45");
        bus.setSpeed(100);
        System.out.println(bus);

        Car car = new Car();
        car.setModel("Audi");
        car.setSpeed(150);
        System.out.println(car);

        Motorbike motorbike = new Motorbike();
        motorbike.setColor("Green");
        motorbike.setSpeed(200);
        System.out.println(motorbike);
    }
}
