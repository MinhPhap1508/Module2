package model.facility;

import java.util.Objects;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private float usableArea;
    private float price;
    private int capacity;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, float usableArea, float price, int capacity, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.price = price;
        this.capacity = capacity;
        this.rentalType = rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(serviceCode, facility.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode);
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(float usableArea) {
        this.usableArea = usableArea;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "-|Cơ sở vật chất|" +
                "Id:'" + serviceCode + '\'' +
                ", Tên dịch vụ:'" + serviceName + '\'' +
                ", diện tích sử dụng:" + usableArea+"m2" +
                ", giá:" + price +
                ", sức chứa tối đa:" + capacity +
                ", hình thức thuê:'" + rentalType;
    }
}
