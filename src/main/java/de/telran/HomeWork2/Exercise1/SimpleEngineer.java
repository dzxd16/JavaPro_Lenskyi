package de.telran.HomeWork2.Exercise1;

public class SimpleEngineer {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.setSubdivision("Администрация");
        engineer.setAge(45);
        engineer.setGender("М");
        engineer.setJobTitle("Механик");
        engineer.setLanguage("English");
        engineer.setName("John Smitt");
        System.out.println(engineer);

    }
}
