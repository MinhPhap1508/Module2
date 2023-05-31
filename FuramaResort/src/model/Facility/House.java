package model.Facility;

import model.Facility.Facility;

public class House extends Facility {
    private String roomStandard;
    private int floors;

    public House() {
    }

    public House(String serviceCode, String serviceName, float usableArea, float price, int capacity, String rentalType, String roomStandard, int floors) {
        super(serviceCode, serviceName, usableArea, price, capacity, rentalType);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floors=" + floors +
                '}';
    }
}
