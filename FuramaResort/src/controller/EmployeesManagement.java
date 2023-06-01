package controller;

import service.IEmployeeService;
import service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeesManagement {
    private static IEmployeeService employeeService = new EmployeeService();

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select functions");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Remove employee");
            System.out.println("5. Search employee");
            System.out.println("6. Return main menu");
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
                        employeeService.displayAll();
                        break;
                    case 2:
                        employeeService.addEmployee();
                        break;
                    case 3:
                        employeeService.editEmployee();
                        break;
                    case 4:
                        employeeService.removeEmployee();
                        break;
                    case 5:
                        employeeService.searchEmployee();
                        break;
                    case 6:
                        FuramaController.displayMainMenu();
                    default:
                        System.out.println("Vui lòng chọn 1 trong 4 chức năng");

                }
            }

        } while (true);
    }
}
