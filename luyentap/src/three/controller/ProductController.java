package three.controller;

import three.service.IProductService;
import three.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService productService = new ProductService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("------------------------\n" +
                    "1. Hieern thị danh sách san pharm\n" +
                    "2. Thêm mới sản phẩm\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Tìm kiếm sản phẩm\n" +
                    "0. Thoát\n" +
                    "Chọn chưc năng:");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("mời nhập ssoo");
                }
            }
            switch (choice) {
                case 1:
                    productService.displayAll();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.removeProduct();
                    break;
                case 4:
                    productService.searchProduct();
                    break;
                case 0:
                    System.exit(1);
                default:
                    System.out.println("ời chọn đúng chức năng hiện có");
            }
        } while (true);
    }
}
