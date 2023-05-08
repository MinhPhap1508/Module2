package ss1.bai_tap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double VND = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền usd: ");
        usd = scanner.nextDouble();
        double quydoi = usd * VND;
        System.out.print("Giá trị VND: " + quydoi);
    }
}
