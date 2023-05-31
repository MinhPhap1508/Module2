package controller;

import java.util.Scanner;

public class BookingManagement {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----------------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
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
                    break;
                case 5:
                    break;
                case 6:
                    FuramaController.displayMainMenu();
                    break;
            }
        } while (true);
    }
}
