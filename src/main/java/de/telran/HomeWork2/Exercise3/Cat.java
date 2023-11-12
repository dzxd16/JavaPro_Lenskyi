package de.telran.HomeWork2.Exercise3;

public class Cat extends Pet{
    private String color;

    public Cat(){
        this.setSpecie("cat");
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
