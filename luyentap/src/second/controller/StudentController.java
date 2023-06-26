package second.controller;

import second.service.IServiceStudent;
import second.service.ServiceStudent;

import java.util.Scanner;

public class StudentController {
    private static final Scanner scanner = new Scanner(System.in);
    private static IServiceStudent serviceStudent = new ServiceStudent();
    public static void menu(){
        do {
            System.out.println("1. hien thi hoc sinh\n" +
                    "2. them\n" +
                    "3. xoa\n" +
                    "4. tim\n" +
                    "5. thoat\n" +
                    "chọn :");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    serviceStudent.displayStudent();
                    break;
                case 2:
                serviceStudent.addStudent();
                break;
                case 3:
                    serviceStudent.deleteStudent();
                    break;
                case 4:
                    serviceStudent.searchStudent();
                    break;
                case 5:
                    System.exit(1);
            }
        }while (true);
    }
}
