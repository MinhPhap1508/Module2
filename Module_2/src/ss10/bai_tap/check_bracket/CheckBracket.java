package ss10.bai_tap.check_bracket;

import java.util.Stack;

public class CheckBracket {
    public static boolean check(String string) {
        Stack<String> bStack = new Stack<>();
        String[] newString = string.split("");
        for (String i : newString) {
            if (i.equals("(")) {
                bStack.push(i);
            }
            if (i.equals(")")) {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }
        if (!bStack.isEmpty()) {
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "((a+b)*(b+c))";
        if (check(string)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

}

