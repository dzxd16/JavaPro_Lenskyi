package de.telran.HomeWork2.Exercise4;

public class Box {
    private int width;
    private int length;

    private int height;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    private int volume() {
        return this.height*this.length*this.width;
    }

    public float result(float quantity){
        float i;
        i = quantity / volume();
        return i;
    }

}
