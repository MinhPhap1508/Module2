package controller;

import service.IFacilityService;
import service.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    private static  IFacilityService facilityService= new FacilityService();
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----------------");
            System.out.println("1. Hiển thị danh sách cơ sở vật chất");
            System.out.println("2. Thêm mới cơ sở vật chất");
            System.out.println("3. Hiển thị danh sách cơ sở vật chất đang bảo trì");
            System.out.println("4. Xóa danh sách cơ sở vật chất đang bảo trì");
            System.out.println("5. Trở lại menu chính");
            System.out.println("Chọn chức năng: ");
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
                    facilityService.displayFacility();
                    break;
                case 2:
                    facilityService.addFacility();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
            }

        } while (true);
    }

}
