package thuat_toan;

import java.util.ArrayList;
import java.util.List;

public class bai_2 {
    //Cho hai xâu kí tự, tìm số lượng ký tự chung giữa chúng.
    public static void main(String[] args) {
        String s1 = "Abcdef";
        String s2 = "Adghjklbc";
        checkCount(s1,s2);
    }

    public static void checkCount(String s1, String s2) {
        List<Character> characterList1 = new ArrayList<>();
        List<Character> characterList2 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            characterList1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            characterList2.add(s2.charAt(i));
        }
        for (int i = 0; i < characterList1.size(); i++) {
            for (int j = 0; j < characterList2.size(); j++) {
                if (characterList1.get(i).equals(characterList2.get(j))) {
                    characterList2.remove(characterList2.get(j));
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

