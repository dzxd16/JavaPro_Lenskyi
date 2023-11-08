package de.telran.HomeWork1;

public class Pfone {
    String number;
    String model;
    float weight;

    public Pfone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String namePerson) {
        System.out.println("Звонит " + namePerson);
    }

    public void getNumber() {
        System.out.println("№ " + this.number);
    }
}
