package de.telran.module_1.lesson_1;

public class Cat {
    String name;
    private int weight;
    private int age;

    private boolean strerilized;

    public void setWeight(int weight) {
        if (weight>0) {
            this.weight = weight;
        }else System.out.println("Error parametr");
    }


    public void setAge(int age) {
        if (age>0){
        this.age = age;}
        else{
            System.out.println("Error parametr");
        }
    }

    public boolean isStrerilized() {
        return strerilized;
    }



    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    void sayMeow(){
        System.out.println("I am " + name + ", my weight "+weight+" my agt is "+ age + "Мяу");
    }

    void sleep() {
        System.out.println(name + " I am sleeping");
    }

    void eat() {
        System.out.println(name + " I am eating");
    }

}
