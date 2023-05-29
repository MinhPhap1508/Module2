package ss16.bai_tap.bai_1_save_file_binary.product_mvc.repository;

import ss16.bai_tap.bai_1_save_file_binary.product_mvc.model.Product;

import java.util.List;

public interface IRepository {
    void addProduct(Product product);
    void removeProduct(Product product);
    List<Product> getAll();
    Product getById(String id);
    List<Product> search(String name);

}
