package de.telran.HomeWork2.Exercise3;

public class Lion extends Animal{
    private String region;

    public void setRegion(String region) {
        this.region = region;
    }

    public Lion(String region) {
        this.setSpecie("Lion");
        this.region = region;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "region='" + region + '\'' +
                "} " + super.toString();
    }
}
