package bai_tap_them_mvc.controller;

import bai_tap_them_mvc.service.ImanageService;
import bai_tap_them_mvc.service.impl.StudentService;
import bai_tap_them_mvc.service.impl.TeacherService;

import java.util.Scanner;

public class ManageController {
    private static Scanner scanner = new Scanner(System.in);
    private static ImanageService studentService = new StudentService();
    private static ImanageService teacherService = new TeacherService();


    public static void menu() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("------------------------");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới học sinh hoặc giảng viên");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng:");
            int choice;
            int choice1;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            }

            switch (choice) {
                case 0:
                    System.out.println("Welcome");
                    System.exit(1);
                case 1:
                    while (true) {

                        System.out.println("Nhập số 1 nếu bạn muốn thêm sinh viên");
                        System.out.println("Nhập số 2 nếu bạn muốn thêm giảng viên");
                        try {
                            choice1 = Integer.parseInt(scanner.nextLine());
                            switch (choice1) {
                                case 1:
                                    studentService.addPerson();
                                    break;
                                case 2:
                                    teacherService.addPerson();
                                    break;
                            }
                            break;
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập số");
                        }

                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("1. Sinh Viên");
                        System.out.println("2. Giảng Viên");
                        try {
                            choice1 = Integer.parseInt(scanner.nextLine());
                            switch (choice1) {
                                case 1:
                                    studentService.removePerson();
                                    break;
                                case 2:
                                    teacherService.removePerson();
                                    break;
                            }
                            break;
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập số");
                        }
                    }break;


                case 3:
                    while (true) {
                        System.out.println("1. Sinh viên");
                        System.out.println("2. Giảng viên");
                        try {
                            choice1 = Integer.parseInt(scanner.nextLine());
                            switch (choice1) {
                                case 1:
                                    studentService.getAll();
                                    break;
                                case 2:
                                    teacherService.getAll();
                                    break;
                            }
                            break;
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập số");
                        }
                    }break;
            }
        } while (true);
    }
}
