package de.telran.HomeWork2.Exercise2;

public class Bus extends Vehicle{
    private String number;

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "number='" + number + '\'' +
                "} " + super.toString();
    }
}
