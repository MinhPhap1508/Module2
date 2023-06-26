package bai_1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Prefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập độ dài mảng a");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 0 || n > 100);

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng a là");
        System.out.println(Arrays.toString(array));
        int prefixSum=0;
        Set<Integer> integerSet= new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            prefixSum+=array[i];
           integerSet.add(prefixSum);
        }
        System.out.println("Mảng prefixSum của a là");
        System.out.println(integerSet);
    }
}
