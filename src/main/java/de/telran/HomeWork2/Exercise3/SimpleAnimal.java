package de.telran.HomeWork2.Exercise3;

public class SimpleAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("Black");
        cat.setBreed("Sphinx");
        cat.setNickname("Murzik");
        System.out.println(cat);

        Chimpanzee chimpanzee = new Chimpanzee();
        chimpanzee.setBloodType(1);
        System.out.println(chimpanzee);

        Cow cow = new Cow(4);
        cow.setNickname("Mashka");
        System.out.println(cow);

        Dog dog = new Dog(40f);
        dog.setBreed("Kolly");
        dog.setNickname("Bobic");
        System.out.println(dog);

        Lion lion = new Lion("Africa");
        System.out.println(lion);

        Orangutan orangutan = new Orangutan("Kalimantan");
        System.out.println(orangutan);

        Tiger tiger = new Tiger(3f);
        System.out.println(tiger);
    }
}
