package controller;

import java.util.Scanner;

public class FacilityManagement {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----------------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Delete list facility maintenance");
            System.out.println("5. Return main menu");
            System.out.println("Select functions");
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
