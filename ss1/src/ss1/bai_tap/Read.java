package ss1.bai_tap;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số: ");
        num = scanner.nextInt();
        if (num < 10 && num >= 0) {
            switch (num) {
                case 1:
                    System.out.println("One hundred");
                    break;
                case 2:
                    System.out.println("Two hundred");
                    break;
            }
        }
    }
}
