package controller;

import java.util.Scanner;

public class Employees {
    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select functions");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            while (true) {
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
                        System.out.println("ok");
                        break;
                    case 2:
                        System.out.println("2. Add new employee");
                        break;
                    case 3:
                        System.out.println("3. Edit employee");
                        break;
                    case 4:
                        FuramaController.displayMainMenu();
                        break;
                    default:
                        System.out.println("Vui lòng chọn 1 trong 4 chức năng");

                }
            }

        }while (true);
    }
}
