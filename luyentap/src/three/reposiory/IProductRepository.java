package three.reposiory;

import three.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
    void addProduct(Product product);
    void removeProduct(Product product);
    Product getById(String id);
    void searchProduct(String name);
}
