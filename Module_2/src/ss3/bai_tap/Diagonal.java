package ss3.bai_tap;

import java.util.Scanner;

public class Diagonal {
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
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i][i];
        }
        System.out.print("Giá trị của đường chéo chính là: "+sum);
    }
}
