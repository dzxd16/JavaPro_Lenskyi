package de.telran.HomeWork2.Exercise3;

public class Animal {
    private String specie;

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "specie='" + specie + '\'' +
                '}';
    }
}
