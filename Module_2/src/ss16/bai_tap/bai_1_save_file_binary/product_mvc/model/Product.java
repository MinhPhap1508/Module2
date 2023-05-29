package ss16.bai_tap.bai_1_save_file_binary.product_mvc.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private int Price;
    private String origin;
    private String describe;

    public Product(String id, String name, int price, String origin, String describe) {
        this.id = id;
        this.name = name;
        Price = price;
        this.origin = origin;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Price=" + Price +
                ", origin='" + origin + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
