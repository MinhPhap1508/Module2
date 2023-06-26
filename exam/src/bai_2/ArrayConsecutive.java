package bai_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConsecutive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;

        do {
            System.out.println("Nhập số lượng phần tử");
            length = Integer.parseInt(scanner.nextLine());
        } while (length < 0 || length > 200);
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int max =array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Mảng này là:");
        System.out.println(Arrays.toString(array));
        System.out.println("Số lớn nhất trong mảng là: "+max);
        System.out.println("Số bé nhất trong mảng là: "+min);
    }
}
