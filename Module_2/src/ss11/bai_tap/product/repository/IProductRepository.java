package ss11.bai_tap.product.repository;

import ss11.bai_tap.product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void addProduct(Product product);

    Product getById(String id);

    void removeProduct(Product product);

    void getByName(String name);
    void editProduct(Product product);
    void sortUpAscending();
    void sortDescending();

}
