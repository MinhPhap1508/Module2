package ss17.bai_tap.validate_number_phone;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        System.out.println("Kiểm tra tính hợp lệ của số điện thoại");
        String regexPhoneNumber = "^[(]\\d{2}[)][-][(][0]\\d{9}[)]$";
        do {
            System.out.println("Nhập sdt để kiểm tra");
            phoneNumber = scanner.nextLine();
        } while (!checkPhoneNumber(phoneNumber, regexPhoneNumber));
        System.out.println("Số điện thoại ok");
    }

    public static boolean checkPhoneNumber(String phoneNumber, String regex) {
        return phoneNumber.matches(regex);
    }
}
