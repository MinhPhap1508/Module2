package thuat_toan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class bai_1 {
    //    Cho một mảng số nguyên Hãy kiểm tra xem tần số xuất hiện của tất cả các số nguyên trong mảng có bằng nhau hay không
    public static void main(String[] args) {
        String s1 = "1, 2, 2, 3, 1, 3, 1, 3";
        System.out.println(checkEqual(s1));
    }

    public static boolean checkEqual(String arr) {
        String[] numbers = arr.split(",");
        Map<String, Integer> frequency = new HashMap<>();
        for (String num : numbers) {
            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            }else {
                frequency.put(num,1);
            }
        }
        int firstValue=-1;
        for (int value: frequency.values()) {
            if(firstValue==-1){
                firstValue=value;
            }else if (value != firstValue) {
                return false;
            }
        }
        return true;
    }

}
