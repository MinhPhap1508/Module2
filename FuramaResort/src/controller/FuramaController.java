package controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------------");
            System.out.println("FuramaResort");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Select functions: ");
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
                        System.out.println("Exit");
                        System.exit(1);
                    default:
                        System.out.println("Nhập lại lựa chọn từ 1 đến 6");
                }
        } while (true);


    }
}
