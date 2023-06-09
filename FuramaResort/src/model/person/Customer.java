package model.person;

public class Customer extends Person{
private String customerSegment;
private String address;

    public Customer() {
    }

    public Customer(String code, String name, String date, String gender, String idCard, String numberPhone, String email, String customerSegment, String address) {
        super(code, name, date, gender, idCard, numberPhone, email);
        this.customerSegment = customerSegment;
        this.address = address;
    }

    public String getCustomerSegment() {
        return customerSegment;
    }

    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "-Khách hàng:" +
                super.toString()+
                ", phân khúc khách hàng='" + customerSegment + '\'' +
                ", địa chỉ='" + address;
    }
}
