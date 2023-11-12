package de.telran.HomeWork2.Exercise3;

public class Monkey extends Animal{
    private boolean tail;
    private String typeMonkey;

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public void setTypeMonkey(String typeMonkey) {
        this.typeMonkey = typeMonkey;
    }

    public Monkey() {
        this.setSpecie("Monkey");
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "tail=" + tail +
                ", typeMonkey='" + typeMonkey + '\'' +
                "} " + super.toString();
    }
}
