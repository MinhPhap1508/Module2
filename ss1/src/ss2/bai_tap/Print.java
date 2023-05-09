package ss2.bai_tap;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        int choice = 0;
        while (choice != 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1: Print the rectangle");
            System.out.println("2: Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3: Print isosceles triangle");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            int height, width;

            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều cao: ");
                    height = scanner.nextInt();
                    System.out.print("Nhập chiều rộng: ");
                    width = scanner.nextInt();
                    System.out.println("1: Print the rectangle");
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
                    System.out.println("Left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Right");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= 5 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("3: Print isosceles triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 * 2; j++) {
                            if (j >= 5 - i - 1 && j <= 5 + i - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
            }
        }
    }
}
