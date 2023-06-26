package first.controller;

import first.service.IProductService;
import first.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IProductService PRODUCT_SERVICE = new ProductService();

    public static void menu() {
        do {
            System.out.println("Chào mừng tới apple Store\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm sản phẩm\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Tìm kiếm sp\n" +
                    "Vui log chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    PRODUCT_SERVICE.displayProduct();
                    break;
                case 2:
                    PRODUCT_SERVICE.addProduct();
                    break;
                case 3:
                    PRODUCT_SERVICE.removeProduct();
                    break;
                case 4:
                    PRODUCT_SERVICE.searchProduct();
                    break;
                case 5:
                    System.exit(1);
            }
        }while (true);

    }
}
