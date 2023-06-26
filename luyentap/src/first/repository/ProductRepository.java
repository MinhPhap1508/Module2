package first.repository;


import first.common.ReadAndWrite;
import first.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PRODUCT_PATH = "src/first/data/product.csv";
    private static List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> getAll() {
        List<String> stringList = ReadAndWrite.readFile(PRODUCT_PATH);
        productList.clear();
        String[] info;
        for (String str : stringList) {
            info = str.split(",");
            productList.add(new Product(info[0], info[1], Integer.parseInt(info[2]), info[3]));
        }
        return productList;
    }

    @Override
    public Product getById(String id) {
        productList = getAll();
        for (Product str : productList) {
            if (str.getId().equals(id)) {
                return str;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getId() + "," + product.getName() + "," + product.getPrice() + "," + product.getDescribe());
        ReadAndWrite.writeFile(stringList, PRODUCT_PATH, true);
    }

    @Override
    public void removeProduct(Product product) {
        productList = getAll();
        productList.remove(product);
        List<String> stringList = new ArrayList<>();
        for (Product temp : productList) {
            stringList.add(temp.getId() + "," + temp.getName() + "," + temp.getPrice() + "," + temp.getDescribe());
        }
        ReadAndWrite.writeFile(stringList, PRODUCT_PATH, false);
    }

    @Override
    public void searchProduct(String name) {
        productList = getAll();
        for (Product str : productList) {
            if (str.getName().contains(name)) {
                System.out.println(str);
            }
        }
    }
}
