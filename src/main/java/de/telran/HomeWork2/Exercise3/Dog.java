package de.telran.HomeWork2.Exercise3;

public class Dog extends Pet{
    private float weight;

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Dog(float weight) {
        this.weight = weight;
        this.setSpecie("Dog");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
