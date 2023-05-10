package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6};
        int numberX;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xóa: ");
        numberX = scanner.nextInt();
        int index;
        for (int i = 0; i < array.length; i++) {
            if (numberX == array[i]) {
                array[i] = 0;
                for (int j = i; j < array.length - 1; j++) {
                    index = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = index;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
