package de.telran.HomeWork061212.Ex3;

public class SimpleBus {
        public static void main(String[] args) {
            BusService busService = new BusService();

            Bus bus1 = new Bus(101, "ABC123", 37.7749, -122.4194);
            Bus bus2 = new Bus(102, "XYZ456", 34.0522, -118.2437);

            busService.addBus(bus1);
            busService.addBus(bus2);

            Bus foundBus = busService.getBusByNumber(101);

            if (foundBus != null) {
                System.out.println("Bus Number: " + foundBus.getBusNumber());
                System.out.println("Vehicle Number: " + foundBus.getRegNumber());
                System.out.println("GPS Coordinates: (" + foundBus.getLatitude() + ", " + foundBus.getLongitude() + ")");
            } else {
                System.out.println("Bus not found");
            }
        }

}
