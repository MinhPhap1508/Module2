package thuat_toan;

import java.util.Arrays;

public class bai_5 {
    //Xếp hàng theo chiều cao tăng dần:
    //Một nhóm người đứng thành hàng trong công viên. Giữa họ có một số cây không thể di chuyển
    //Giá trị “-1” đại diện cho cây trong công viên.
    public static void main(String[] args) {
        int temp = 0;
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j] && arr[i] != -1 && arr[j] != -1) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

