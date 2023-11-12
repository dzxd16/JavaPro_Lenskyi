package de.telran.HomeWork2.Exercise3;

public class Cow extends Pet{
    private int age ;

    public void setAge(int age) {
        this.age = age;
    }

    public Cow(int age) {
        this.age = age;
        this.setSpecie("Cow");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "age=" + age +
                "} " + super.toString();
    }
}
