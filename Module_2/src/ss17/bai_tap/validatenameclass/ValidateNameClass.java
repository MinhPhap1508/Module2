package ss17.bai_tap.validatenameclass;

import java.util.Scanner;

public class ValidateNameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameClass;
        String regexNameClass = "^[CAP]\\d{4}[GHIK]$";
        System.out.println("Kiểm tra tính hợp lệ của tên một lớp học");
        do {
            System.out.println("Nhập tên để kiểm tra");
            nameClass = scanner.nextLine();
        } while (!checkNameClass(nameClass, regexNameClass));
        System.out.println("Ok");


    }

    public static boolean checkNameClass(String nameClass, String regex) {
        return nameClass.matches(regex);
    }

}
