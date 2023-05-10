package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Max2Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int length;
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
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị max là: " + max);
    }
}
