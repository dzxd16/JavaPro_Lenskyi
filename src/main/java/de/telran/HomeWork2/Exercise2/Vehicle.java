package de.telran.HomeWork2.Exercise2;

public class Vehicle {
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                '}';
    }
}
