package ss10.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        int[] arr = {1, 2, 34, 9, 6};
        for (Integer i : arr) {
            stack.push(i);
        }
        System.out.println(stack);
        Integer[] newArr = new Integer[stack.size()];
        for (int i = 0; !stack.isEmpty(); i++) {
            newArr[i] = stack.pop();
        }
        System.out.println("mảng số nguyên: " + Arrays.toString(newArr));

        // Đảo ngược chuỗi.

        Stack<String> wStack = new Stack<>();
        String mWord = "tran minh phap";
        String stringDisplay = "";
        String[] words = mWord.split("\\s");
        for (String i : words) {
            wStack.push(i);
        }
        System.out.println("Mảng trước khi đảo ngược " + Arrays.toString(words));
        for (String i : words) {
            stringDisplay += wStack.pop() + " ";
        }
        System.out.println("Chuỗi sau khi đảo ngược là " + stringDisplay);
    }

}
