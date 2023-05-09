package ss2.bai_tap;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCheck;
        System.out.print("Nhập tổng snt cần hiển thị: ");
        numberCheck = scanner.nextInt();
        int count = 0;
        for (int i = 0; count <=numberCheck ; i++) {
            if (check(i)){
                System.out.println(i);
                count++;
            }
        }
    }

    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return  true;
        }
    }



