package ss17.thuc_hanh;

import java.util.Arrays;

public class Math {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        solution(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] solution(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]&&a[i]!=-1&&a[j]!=-1) {
                       int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                }
            }
        }
        return a;
    }
}


