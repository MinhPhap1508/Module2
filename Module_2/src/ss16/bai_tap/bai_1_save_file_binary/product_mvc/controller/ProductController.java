package ss16.bai_tap.bai_1_save_file_binary.product_mvc.controller;

import ss16.bai_tap.bai_1_save_file_binary.product_mvc.service.IProductService;
import ss16.bai_tap.bai_1_save_file_binary.product_mvc.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService productService= new ProductService();
    public static void menu(){
        do {
            scanner= new Scanner(System.in);
            System.out.println("----------------------");
            System.out.println("Chọn chức năng bạn muốn thực hiện");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Hiển thị danh sách sản phẩm");
            System.out.println("4. Tìm kiếm thông tin sản phẩm");
            System.out.println("0. Rời khỏi cửa hàng");
            System.out.println("Chọn chức năng: ");
            int choice;
            while (true){
                try {
                    choice=Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException numberFormatException){
                    System.out.println("Vui lòng nhập số để chọn chức năng");
                }
            }
            switch (choice){
                case 0:
                    System.out.println("Xin chào và hẹn gặp lại");
                    System.exit(1);
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.removeProduct();
                    break;
                case 3:
                    productService.displayAll();
                    break;
                case 4:
                    productService.searchInfo();
                    break;
            }

        }while (true);
    }
}
