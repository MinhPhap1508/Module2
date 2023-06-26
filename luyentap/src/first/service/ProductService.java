package first.service;

import first.model.Product;
import first.repository.IProductRepository;
import first.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IProductRepository PRODUCT_REPOSITORY = new ProductRepository();

    @Override
    public void addProduct() {
        System.out.println("Nập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("NNaajp mo tả");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, describe);
        PRODUCT_REPOSITORY.addProduct(product);
        System.out.println("Them mới thành công");
    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập id cần xóa");
        String id = scanner.nextLine();
        Product product = PRODUCT_REPOSITORY.getById(id);
        if (product == null) {
            System.out.println("Mã id ko totfn tại");
        } else {
            System.out.println("bạn có xóa");
            System.out.println("1. xóa");
            System.out.println("2. ko");
            int choice;
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                PRODUCT_REPOSITORY.removeProduct(product);
            }
            System.out.println("Xóa thành công");
        }
    }

    @Override
    public void displayProduct() {
        List<Product> products = PRODUCT_REPOSITORY.getAll();
        for (Product str:products) {
            System.out.println(str);
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập tên sp cần tìm");
        String name=scanner.nextLine();
        PRODUCT_REPOSITORY.searchProduct(name);
    }
}
