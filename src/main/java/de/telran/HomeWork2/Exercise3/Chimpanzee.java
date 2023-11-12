package de.telran.HomeWork2.Exercise3;

public class Chimpanzee extends Monkey{
    private int  bloodType;

    public Chimpanzee() {
        this.setTypeMonkey("Chimpanzee");
        this.setTail(false);
    }
    public void setBloodType(int bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Chimpanzee{" +
                "bloodType=" + bloodType +
                "} " + super.toString();
    }
}
