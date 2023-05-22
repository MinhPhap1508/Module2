package ss11.bai_tap.product.controller;

import ss11.bai_tap.product.service.IService;
import ss11.bai_tap.product.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IService productService = new ProductService();

    public static void menu() {
        do {
            System.out.println("---------------------------------------");
            System.out.println("Lựa chọn chức năng: ");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm ");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.editProduct();
                    break;
                case 3:
                    productService.removeProduct();
                    break;
                case 4:
                    productService.displayAll();
                    break;
                case 5:
                    productService.findProduct();
                    break;
                case 6:
                    productService.arrangeProduct();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã mua hàng. Xin chào hẹn gặp lại");
                    System.exit(1);
            }
        } while (true);
    }
}
