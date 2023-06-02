package controller;

import service.ICustomerService;
import service.impl.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    private static ICustomerService customerService= new CustomerService();
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select Functions");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search by name customer");
            System.out.println("6. Return main menu");
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
                    customerService.displayAll();
                    break;
                case 2:
                    customerService.addCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    customerService.deleteCustomer();
                    break;
                case 5:
                    customerService.searchCustomer();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Vui lòng chọn chức năng từ 1 đến 6");
            }
        } while (true);

    }
}
