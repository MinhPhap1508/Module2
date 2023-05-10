package ss3.bai_tap;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        String str = "Code Gym Center";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kí tự cần kiểm tra: ");
        char word;
        word = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word) {
                count++;
            }
        }
        System.out.print("Kí tự " + word + "xuất hiện " + count + " lần trong mảng");
    }
}
