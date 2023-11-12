package de.telran.HomeWork2.Exercise2;

public class Motorbike extends Vehicle{
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
