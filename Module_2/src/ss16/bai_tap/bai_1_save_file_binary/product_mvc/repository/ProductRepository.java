package ss16.bai_tap.bai_1_save_file_binary.product_mvc.repository;

import ss16.bai_tap.bai_1_save_file_binary.product_mvc.common.ReadAndWrite;
import ss16.bai_tap.bai_1_save_file_binary.product_mvc.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IRepository {
    static List<Product> productList = new ArrayList<>();
    private static final String PRODUCT_LIST_PATH = "src/ss16/bai_tap/bai_1_save_file_binary/product_mvc/common/product_list.dat";

    static {
        Product product1 = new Product("T12", "Dell", 2000000, "America", "Very Fast");
        Product product2 = new Product("A11", "Asus", 300000, "Taiwan", "Gaming");
        Product product3 = new Product("A00", "Apple", 1000, "America", "Very expensive");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
//        ReadAndWrite.writeProduct(productList,PRODUCT_LIST_PATH);
    }

    @Override
    public void addProduct(Product product) {
        productList = ReadAndWrite.readProduct(PRODUCT_LIST_PATH);
        productList.add(product);
        ReadAndWrite.writeProduct(productList, PRODUCT_LIST_PATH);
    }

    @Override
    public void removeProduct(Product product) {
        List<Product> list = ReadAndWrite.readProduct(PRODUCT_LIST_PATH);
        int index = -1;
        for (Product p : list) {
            if (p.getId().equals(product.getId())) {
                index = list.indexOf(p);
            }
        }
        list.remove(index);
        ReadAndWrite.writeProduct(list, PRODUCT_LIST_PATH);
    }

    @Override
    public List<Product> getAll() {
        productList = ReadAndWrite.readProduct(PRODUCT_LIST_PATH);
        return productList;
    }

    @Override
    public Product getById(String id) {
        productList = ReadAndWrite.readProduct(PRODUCT_LIST_PATH);
        for (Product p : productList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = ReadAndWrite.readProduct(PRODUCT_LIST_PATH);
        for (Product p : products) {
            if (p.getName().contains(name)) {
                productList.add(p);
            }
        }
        return productList;
    }
}
