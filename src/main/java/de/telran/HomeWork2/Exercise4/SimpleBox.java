package de.telran.HomeWork2.Exercise4;

public class SimpleBox {
    public static void main(String[] args) {
        Box box = new Box(2,2,1);
        float rez = box.result(10f);
        System.out.format("%.0f",rez);
    }
}
