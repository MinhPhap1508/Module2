package ss2.thuc_hanh;

import java.util.Scanner;

public class CheckSnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "Không phải là snt");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number+"Là số nguyên tố");
            }else {
                System.out.println(number+" không phải số nguyên tố");
            }
        }
    }
}
