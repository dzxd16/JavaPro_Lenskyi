package de.telran.HomeWork061212.Ex3;

class Bus {
    private int busNumber;
    private String regNumber;
    private double latitude;
    private double longitude;

    public Bus(int busNumber, String regNumber, double latitude, double longitude) {
        this.busNumber = busNumber;
        this.regNumber = regNumber;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Геттеры и сеттеры для необходимых полей

    public int getBusNumber() {
        return busNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
