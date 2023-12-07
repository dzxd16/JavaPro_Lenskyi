package de.telran.HomeWork061212.Ex3;

public class SimpleBus {
        public static void main(String[] args) {
            BusService busService = new BusService();

            Bus bus1 = new Bus(14, "KI 5588 A", 48.8115, 9.3043);
            Bus bus2 = new Bus(15, "KI 2221 A", 48.8189, 9.3175);

            busService.addBus(bus1);
            busService.addBus(bus2);

            Bus foundBus = busService.getBusByNumber(14);

            if (foundBus != null) {
                System.out.println("Bus Number: " + foundBus.getBusNumber());
                System.out.println("Vehicle Number: " + foundBus.getRegNumber());
                System.out.println("GPS Coordinates: (" + foundBus.getLatitude() + ", " + foundBus.getLongitude() + ")");
            } else {
                System.out.println("Bus not found");
            }
        }

}
