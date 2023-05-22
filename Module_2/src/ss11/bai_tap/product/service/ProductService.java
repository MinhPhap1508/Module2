package ss11.bai_tap.product.service;

import ss11.bai_tap.product.model.Product;
import ss11.bai_tap.product.repository.IProductRepository;
import ss11.bai_tap.product.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IService {
    Scanner scanner = new Scanner(System.in);
    private static IProductRepository productRepository = new ProductRepository();

    @Override
    public void displayAll() {
        List<Product> products = productRepository.getAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Nhập mã sản phẩm");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập miêu tả");
        String description = scanner.nextLine();
        Product product = new Product(id, name, price, quantity, description);
        productRepository.addProduct(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeProduct() {
        System.out.print("Bạn muốn xóa sản phẩm nào. Vui lòng nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        Product product = productRepository.getById(id);
        if (product == null) {
            System.out.println("Không có sản phẩm");
        } else {
            System.out.println("Bạn có muốn xóa sản phẩm với tên: " + product.getName());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRepository.removeProduct(product);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void editProduct() {
        System.out.println("Bạn muốn sửa sản phẩm nào. Vui lòng nhập mã sản phẩm");
        String id = scanner.nextLine();
        Product checkproduct = productRepository.getById(id);
        if (checkproduct == null) {
            System.out.println("Id sản phẩm bạn nhập không đúng");
        } else {
            System.out.println("Chọn mục cần sửa");
            System.out.println("1. Sửa tên sản phẩm");
            System.out.println("2. Sửa giá cho sản phẩm");
            System.out.println("3. Sửa số lượng cho sản phẩm");
            System.out.println("4. Nhập lại miêu tả cho sản phẩm");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên sản phẩm cần sửa");
                    String name = scanner.nextLine();
                    checkproduct.setName(name);
                    break;
                case 2:
                    System.out.println("Nhập giá cho sp");
                    int price = Integer.parseInt(scanner.nextLine());
                    checkproduct.setPrice(price);
                    break;
                case 3:
                    System.out.println("Nhập số lượng");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    checkproduct.setQuantity(quantity);
                    break;
                case 4:
                    System.out.println("Nhập lại miêu tả");
                    String description = scanner.nextLine();
                    checkproduct.setDescription(description);
                    System.out.println("Sửa thành công");
            }
        }
    }

    @Override
    public void findProduct() {
        System.out.println("Nhập tên sản phẩm cần tiềm kiếm");
        String name = scanner.nextLine();
        Product products = productRepository.getByName(name);
        if (products == null) {
            System.out.println("Sản phẩm không có trong cửa hàng");
        } else {
            System.out.println(products);
        }
    }

    @Override
    public void arrangeProduct() {
        System.out.println("Chọn cách bạn muốn sắp xếp");
        System.out.println("1. Sắp xếp theo thứ tự tăng dần");
        System.out.println("2. Sắp xếp theo thứ tự giảm dần");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            productRepository.sortUpAscending();
            System.out.println("Sản phẩm đã được sắp xếp tăng dần thành công");
        } else {
            productRepository.sortDescending();
            System.out.println("Sản phẩm được sắp xếp giảm dần thành công");
        }
    }
}
