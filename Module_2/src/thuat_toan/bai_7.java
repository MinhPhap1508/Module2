package thuat_toan;

import java.util.Set;
import java.util.TreeSet;

public class bai_7 {
    //Viết hàm truyền vào một mảng 2 chiều (n x n) chứa các số nguyên bất kỳ
    //Hàm sẽ trả về 1 mảng (1 chiều )các số nguyên tố đã được sắp xếp tăng dần.
    // Với các phần tử là các số nguyên tố xuất hiện trong mảng 2 chiều.
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 8, 43}, {9, 4, 11, 7}, {11, 6, 4, 0}, {1, 2, 6, 51}};
        Set<Integer> integerSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (checkIsPrime(arr[i][j])) {
                    integerSet.add(arr[i][j]);
                }
            }
        }
        System.out.println(integerSet);
    }

    public static boolean checkIsPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
