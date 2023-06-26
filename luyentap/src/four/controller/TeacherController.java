package four.controller;

import four.service.ITeacherService;
import four.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static final Scanner scanner = new Scanner(System.in);
    private static ITeacherService teacherService = new TeacherService();
    public static void menu(){
        do {
            System.out.println("---------------------\n" +
                    "1. hien thi\n" +
                    "2. them\n" +
                    "3. xóa\n" +
                    "4. tìm\n" +
                    "0. thoát");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    teacherService.displayAll();
                    break;
                case 2:
                    teacherService.addTeacher();
                    break;
                case 3:
                    teacherService.deleteTeacher();
                    break;
                case 4:
                    teacherService.searchTeacher();
                    break;
                case 0:
                    System.exit(1);
            }
        }while (true);
    }
}
