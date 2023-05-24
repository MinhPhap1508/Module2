package ss13.bai_tap;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] list = {12, 543, 7, 88, -4, 123, 9};
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static void insertionSort(int[] list) {
        int element;
        int pos;
        for (int i = 1; i < list.length; i++) {
            element = list[i];
            pos = i;
            while (pos > 0 && element < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = element;
        }
    }
}
