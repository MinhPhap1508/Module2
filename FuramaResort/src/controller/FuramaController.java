package controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------------");
            System.out.println("FuramaResort");
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý khách hàng");
            System.out.println("3. Quản lý cơ sở vật chất");
            System.out.println("4. Quản lý Booking");
            System.out.println("5. Dịch vụ khuyến mãi");
            System.out.println("6. Thoát");
            System.out.println("Chọn chức năng: ");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            }

                switch (choice) {
                    case 1:
                        EmployeesManagement.displayMenu();
                        break;
                    case 2:
                        CustomerManagement.displayMenu();
                        break;
                    case 3:
                        FacilityManagement.displayMenu();
                        break;
                    case 4:
                        BookingManagement.displayMenu();
                        break;
                    case 5:
                        PromotionManagement.displayMenu();
                        break;
                    case 6:
                        System.out.println("Chào tạm biệt mọi người");
                        System.exit(1);
                    default:
                        System.out.println("Nhập lại lựa chọn từ 1 đến 6");
                }
        } while (true);


    }
}
