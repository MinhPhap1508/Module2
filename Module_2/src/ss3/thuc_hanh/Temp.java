package ss3.thuc_hanh;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempF;
        double tempC;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0: Exit");
            System.out.print("Enter your choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter tempF: ");
                    tempF = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + convertFtoC(tempF));
                    break;
                case 2:
                    System.out.print("Enter tempC: ");
                    tempC = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + convertCtoF(tempC));
                    break;
            }
        } while (choice != 0);


    }

    public static double convertCtoF(double tempC) {
        double tempF = (9.0 / 5) * tempC + 32;
        return tempF;
    }

    public static double convertFtoC(double tempF) {
        double tempC = (5.0 / 9) * (tempF - 32);
        return tempC;
    }
}
