package de.telran.HomeWork2.Exercise1;
//Землянин
public class Earthling {
    private int age;
    private String gender;

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Earthling{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
