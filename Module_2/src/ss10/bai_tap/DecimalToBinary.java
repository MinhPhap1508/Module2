package ss10.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String binary = "";
        int decimal;
        int remainder;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số decimal: ");
        decimal = Integer.parseInt(scanner.nextLine());
        while (decimal > 0) {
            remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        for (int i = 0; i < stack.size(); i++) {
            binary += stack.pop();
        }
        System.out.println(binary);
    }
}
