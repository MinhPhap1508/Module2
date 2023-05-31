package mvc_exam.repository;

import mvc_exam.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void addProduct(Product product);

    void removeProduct(Product product);

    Product getById(String id);
}
