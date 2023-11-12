package de.telran.module_1.summary;

public class SimpleFruit {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setColor("white");
        fruit.setSugar(5);
        fruit.setVitamins(new String[]{"A","B","C"});
        System.out.println(fruit);

        Ananas ananas = new Ananas();
        ananas.setColor("yellow");
        ananas.setSugar(2);
        ananas.setVitamins(new String[]{"A","B","C"});
        ananas.setCountry("Spain");
//        ananas.constyVal = "Second";
        System.out.println(ananas);

    }
}
