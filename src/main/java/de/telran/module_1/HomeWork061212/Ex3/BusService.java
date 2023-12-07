package de.telran.HomeWork061212.Ex3;

import java.util.HashMap;
import java.util.Map;

public class BusService {
    private Map<Integer, Bus> busMap;

    public BusService() {
        this.busMap = new HashMap<>();
    }

    public void addBus(Bus bus) {
        busMap.put(bus.getBusNumber(), bus);
    }

    public Bus getBusByNumber(int busNumber) {
        return busMap.get(busNumber);
    }

    // Дополнительные методы для обновления координат и других операций, если необходимо
}

