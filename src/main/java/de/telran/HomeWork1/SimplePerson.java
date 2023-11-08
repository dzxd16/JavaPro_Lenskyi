package de.telran.HomeWork1;

public class SimplePerson {
    public static void main(String[] args) {
        Person person1 = new Person("Петр Петренко", 45);

        Person person2 = new Person();
        person2.fullName = "Семен Семенов";
        person2.age = 24;
        person1.talk();
        person2.move();

        Pfone pfone1 = new Pfone("+380 68 9998877","Nokia",280);
        Pfone pfone2 = new Pfone("+49 1517 2350506","Iphone",205);
        Pfone pfone3 = new Pfone("+34 611223344","Samsung",188);
        pfone1.receiveCall("Емманюель Макрон");
        pfone2.getNumber();
        pfone3.getNumber();
    }
}
