package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử cần thêm: ");
        int numberX = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vị trí cần thêm: ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = array.length; i > index ; i--) {
            array[i-1]=array[i-2];
        }
        array[index]=numberX;
        System.out.print(Arrays.toString(array));
    }
}

