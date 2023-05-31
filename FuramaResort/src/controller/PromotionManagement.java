package controller;

import java.util.Scanner;

public class PromotionManagement {
    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            int choice;
            while (true){
                try {
                    choice=Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException numberFormatException){
                    System.out.println("Vui lòng nhập số");
                }
            }
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController.displayMainMenu();
                    break;
            }
        }while (true);
    }
}
