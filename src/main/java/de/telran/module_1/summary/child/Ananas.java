package de.telran.module_1.summary.child;

import de.telran.module_1.summary.Fruit;

public class Ananas extends Fruit {
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Ananas{" +
                "country='" + country + '\''+ "color='" +super.getColor() + '\'' +
                "} " + super.toString();
    }
}

