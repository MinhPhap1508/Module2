package ss14.bai_tap.illtriangle_exception;

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
                    if (firstEdge <= 0) {
                        throw new TriangleException("Vui lòng nhập số lớn hơn 0");
                    }
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                } catch (TriangleException e) {
                    System.out.println(e.getMessage());
                }
            } while (true);
            float secondEdge;
            do {
                try {
                    System.out.print("Nhập cạnh b: ");
                    secondEdge = Float.parseFloat(scanner.nextLine());
                    if (secondEdge <= 0) {
                        throw new TriangleException("Vui lòng nhập số lớn hơn 0");
                    }
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                } catch (TriangleException e) {
                    System.out.println(e.getMessage());
                }
            } while (true);
            float thirdEdge;
            do {
                try {
                    System.out.print("Nhập cạnh c: ");
                    thirdEdge = Float.parseFloat(scanner.nextLine());
                    if (thirdEdge <= 0) {
                        throw new TriangleException("Vui lòng nhập số lớn hơn 0");
                    }
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                } catch (TriangleException e) {
                    System.out.println(e.getMessage());
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
        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            throw new TriangleException("Độ dài tam giác các cạnh nhập vào không hợp lệ");
        }
        return true;
    }
}
