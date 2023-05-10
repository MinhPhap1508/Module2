package ss3.bai_tap;

import java.util.Scanner;

public class Colum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int length;
        int index;
        System.out.print("Nhập vào số lượng mảng: ");
        size = scanner.nextInt();
        System.out.print("Nhập vào độ dài mảng: ");
        length = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i] = new int[length];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập giá trị phần tử thứ " + j + " mảng " + i);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Nhập số cột cần tính tổng: ");
        index = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (index == i) {
                for (int j = 0; j < arr.length; j++) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.print("Tổng của cột: " + index + " là: " + sum);
    }
}
