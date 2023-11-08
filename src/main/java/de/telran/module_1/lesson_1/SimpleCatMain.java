package de.telran.module_1.lesson_1;

public class SimpleCatMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Murca";
        cat1.setWeight(10);
        cat1.setAge(5);
        cat1.sayMeow();
        cat1.sleep();

        Cat cat2 = new Cat("Barsic", 7,7);
        cat2.sayMeow();
        cat2.sleep();

        Cat cat3 = new Cat("Murcik");
        cat3.sayMeow();
    }
}
