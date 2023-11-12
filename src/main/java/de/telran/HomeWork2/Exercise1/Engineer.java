package de.telran.HomeWork2.Exercise1;
//Инженер
public class Engineer extends Employee{
    private String subdivision;

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "subdivision='" + subdivision + '\'' +
                "} " + super.toString();
    }
}
