package ss10.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "able was i ere i saw elba";
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList();
        String[] newString = string.split("");
        StringBuilder newStack = new StringBuilder();
        StringBuilder newQueue = new StringBuilder();
        for (String i : newString) {
            stack.push(i);
            queue.add(i);
        }
        for (String i : newString) {
            newStack.append(stack.pop());
        }
        for (String i : newString) {
            newQueue.append(queue.poll());
        }
        if (newStack.toString().equals(newQueue.toString())) {
            System.out.println("Chuỗi này là chuỗi Palindrome");
        } else {
            System.out.println("Chuỗi này không phải là Palindrome");
        }
    }
}
