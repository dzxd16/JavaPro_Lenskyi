package de.telran.module_1.summary;

import java.util.Arrays;

//public final class Fruit {//запрет наследования
public class Fruit {
    public final String constyVal = "Started";

    private String color;
    private int sugar;
    private String[] vitamins;

    public void setColor(String color) {
        this.color = color;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setVitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }

    @Override
            //    public final String toString() {
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", sugar=" + sugar +
                ", vitamins=" + Arrays.toString(vitamins) +
                '}';
    }

    protected String getColor() {
        return color;
    }

    int getSugar() {
        return sugar;
    }

    public String[] getVitamins() {
        return vitamins;
    }
}
