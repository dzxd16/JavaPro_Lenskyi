package de.telran.HomeWork2.Exercise2;

public class Bike extends Vehicle{
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
