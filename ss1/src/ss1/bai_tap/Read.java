package ss1.bai_tap;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số: ");
        num = scanner.nextInt();
        int tens = num % 100;
        if (num < 0 || num >= 1000) {
            System.out.println("out of ability");
        } else if (num < 10) {
            switch (num) {
                case 0:
                    System.out.print ("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        } else if (num < 20) {
            switch (num) {
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("Eleven");
                    break;
                case 12:
                    System.out.print("Twelve");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 14:
                    System.out.print("Fourteen");
                    break;
                case 15:
                    System.out.print("Fifteen");
                    break;
                case 16:
                    System.out.print("Sixteen");
                    break;
                case 17:
                    System.out.print("Seventeen");
                    break;
                case 18:
                    System.out.print("Eighteen");
                    break;
                case 19:
                    System.out.print("Nineteen");
                    break;
            }
        } else if (num < 100) {
            switch (tens / 10) {
                case 2:
                    System.out.println("Twenty");
                    break;
                case 3:
                    System.out.println("Thirty");
                    break;
                case 4:
                    System.out.println("forty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("Sixty");
                    break;
                case 7:
                    System.out.println("Seventy");
                    break;
                case 8:
                    System.out.println("Eighty");
                    break;
                case 9:
                    System.out.println("Ninety");
                    break;
            }
            switch (tens % 10) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else {
            switch (num / 100) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
            System.out.print(" hundred ");
            if (tens > 0){
                System.out.print(" and ");
            }
            switch (tens){
                case 11:
                    System.out.print("eleven ");
                    break;
                case 12:
                    System.out.print("twelve ");
                    break;
                case 13:
                    System.out.print("thirteen ");
                    break;
                case 15:
                    System.out.print("fifteen ");
                    break;
            }
            switch (tens/10){
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("fourty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
        }
    }
}
