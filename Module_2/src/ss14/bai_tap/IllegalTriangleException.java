package ss14.bai_tap;

import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            float firstEdge;
            do {
                try {
                    System.out.print("Nhập cạnh a: ");
                    firstEdge = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);
            float secondEdge;
            do {
                try {
                    System.out.print("Nhập cạnh b: ");
                    secondEdge = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);
            float thirdEdge;
            do {
                try {
                    System.out.print("Nhập cạnh c: ");
                    thirdEdge = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);

            try {
                checkTriangle(firstEdge, secondEdge, thirdEdge);
                System.out.println("Độ dài các cạnh hợp lí");
                break;

            } catch (TriangleException triangleException) {
                System.out.println(triangleException.getMessage());
                System.out.println("Vui lòng nhập lại độ dài các cạnh của tam giác");
            }
        }
    }

    public static boolean checkTriangle(float a, float b, float c) throws TriangleException, NumberFormatException {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b) <= c || (b + c) <= a || (a + c) <= b) {
            throw new TriangleException("Độ dài tam giác các cạnh nhập vào không hợp lệ");
        }
        return true;
    }
}
