package thuat_toan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai_6 {
    //Viết hàm truyền vào một chuỗi findChar(string)
    //Hàm trả về 1 mảng chứa các ký tự xuất hiện nhiều hơn 1 lần trong chuỗi.
    // Nếu không có ký tự nào xuất hiện nhiều hơn 1 lần thì trả về mảng rỗng
    public static void main(String[] args) {
        String str = "abcbddcef";
        String[] arr = str.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    list.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
