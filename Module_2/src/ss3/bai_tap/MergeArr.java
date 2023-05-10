package ss3.bai_tap;

import java.util.Arrays;

public class MergeArr {
    public static void main(String[] args) {
        int[] arr1 = {2, 45, 65, 1, 8};
        int[] arr2 = {9, 865, 31, 5, 71, 77};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i];
            arr3[arr1.length]=arr2[i];
        }
//        for (int i = arr1.length; i < arr3.length; i++) {
//            arr3[i] = arr2[i - arr1.length];
//        }
        System.out.print(Arrays.toString(arr3));
    }
}
