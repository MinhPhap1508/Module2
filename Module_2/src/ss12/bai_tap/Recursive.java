package ss12.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử cần tìm");
        int num=Integer.parseInt(scanner.nextLine());
        System.out.println( binarySearch(arr,0, arr.length-1, num));

    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (value == array[middle]) {
            return middle;
        } else if (value < array[middle]) {
            right = middle - 1;
        } else {
            left = middle + 1;
        }
        return binarySearch(array, left, right, value);
    }
}
