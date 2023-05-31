package mvc_exam.repository.impl;

import mvc_exam.common.ReadAndWrite;
import mvc_exam.model.Product;
import mvc_exam.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    List<Product> productList = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/mvc_exam/data/product.csv";

    @Override
    public List<Product> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        productList.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            productList.add(new Product(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), info[4]));
        }
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<String> strings = new ArrayList<>();
        strings.add(product.getId() + "," + product.getName() + "," + product.getPrice() + "," + product.getQuantity() + "," + product.getDescription());
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, true);
    }

    @Override
    public void removeProduct(Product product) {
        productList = getAll();
        productList.remove(product);
        List<String> strings = new ArrayList<>();
        for (Product temp : productList) {
            strings.add(temp.getId() + "," + temp.getName() + "," + temp.getPrice() + "," + temp.getQuantity() + "," + temp.getDescription());
        }
        ReadAndWrite.writeFile(PATH_PRODUCT, strings, false);
    }

    @Override
    public Product getById(String id) {
        productList = getAll();
        for (Product p : productList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
