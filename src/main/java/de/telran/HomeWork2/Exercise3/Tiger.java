package de.telran.HomeWork2.Exercise3;

public class Tiger extends Animal{
    private float length;

    public void setLength(float length) {
        this.length = length;
    }

    public Tiger(float length) {
        this.setSpecie("Tiger");
        this.length = length;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "length=" + length +
                "} " + super.toString();
    }
}
