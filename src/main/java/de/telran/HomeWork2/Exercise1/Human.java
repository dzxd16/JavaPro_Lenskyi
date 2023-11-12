package de.telran.HomeWork2.Exercise1;
//Человек
public class Human extends Earthling{
    private String language;
    private String name;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "language='" + language + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
