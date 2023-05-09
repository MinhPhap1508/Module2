package ss2.thuc_hanh;

import java.util.Scanner;

public class Ucln {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        b = scanner.nextInt();
        a= Math.abs(a);
        b= Math.abs(b);
        if (a==0 || b==0){
            System.out.println("không có ước chung lớn nhất");
        }
        while (a!=b){
            if (a>b)
                a =a-b;
            else
                b=b-a;
        }
        System.out.println("ước chung lớn nhất là: "+ a);
    }
}
