package model.facility;

public class Villa extends House {
    private float poolArea;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, float usableArea, float price, int capacity, String rentalType, String roomStandard, int floors, float poolArea) {
        super(serviceCode, serviceName, usableArea, price, capacity, rentalType, roomStandard, floors);
        this.poolArea = poolArea;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "-Villa, " +
                super.toString()+
                ", diện tích hồ bơi: " + poolArea;
    }
}
