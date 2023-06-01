package controller;

import java.util.Scanner;

public class CustomerManagement {
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
            }
        } while (true);

    }
}
