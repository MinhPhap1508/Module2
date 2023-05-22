package ss10.bai_tap;

import java.util.Map;
import java.util.Set;

public class TreeMap {
    public static void main(String[] args) {
        String string = "Code gym Đà đà Nẵng";
        checkTreeMap(string);
    }

    public static void checkTreeMap(String string) {
        Map<String, Integer> newMap = new java.util.TreeMap<>();
        String[] newString = string.toLowerCase().split("\\s+");
        for (int i = 0; i < newString.length; i++) {
            int count = 0;
            for (int j = 0; j < newString.length; j++) {
                if (newString[i].equals(newString[j])) {
                    count++;
                }
            }
            newMap.put(newString[i], count);
        }
        Set<String> keySet = newMap.keySet();
        for (String key : keySet) {
            System.out.println("Từ " + key + " xuất hiện " + newMap.get(key) + " lần");
        }
    }
}
