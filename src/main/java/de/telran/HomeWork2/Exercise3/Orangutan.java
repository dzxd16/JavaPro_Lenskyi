package de.telran.HomeWork2.Exercise3;

public class Orangutan extends Monkey{
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public Orangutan(String type) {
        this.setTypeMonkey("Orangutan");
        this.type = type;
        this.setTail(false);
    }

    @Override
    public String toString() {
        return "Orangutan{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
