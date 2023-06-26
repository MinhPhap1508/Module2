package first.repository;

import first.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    Product getById(String id);

    void addProduct(Product product);

    void removeProduct(Product product);

    void searchProduct(String name);
}
