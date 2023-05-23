package ss11.bai_tap.product.repository;

import ss11.bai_tap.product.model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("P01", "Sữa yomort", 27000, 100, "chưa nhưng ngon"));
        products.add(new Product("P02", "Bánh", 20000, 120, "Ăn siêu dính"));
        products.add(new Product("P03", "Huda", 275000, 1000, "uống không say không về"));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product getById(String id) {
        for (Product i : products) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void getByName(String name) {
        for (Product p : products) {
            if (p.getName().contains(name)) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void editProduct(Product product) {

    }

    @Override
    public void sortUpAscending() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    @Override
    public void sortDescending() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }

}
