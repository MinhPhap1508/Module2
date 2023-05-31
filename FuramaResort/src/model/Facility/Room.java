package model.Facility;

import model.Facility.Facility;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, float usableArea, float price, int capacity, String rentalType, String serviceFree) {
        super(serviceCode, serviceName, usableArea, price, capacity, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
