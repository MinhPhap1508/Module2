package ss2.thuc_hanh;

import java.util.Scanner;

public class FindRich {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.print("Kích thước không được vượt quá 20");
            }
        }
          while (size>20);
        array = new int[size];
        int i =0;
        while (i<array.length) {
            System.out.print("enter the element"+(i+1)+":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách tài sản: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
        int max = array[0];
        int index =1;
        for (int j = 0; j < array.length; j++) {
            if (array[j]> max){
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("Giá trị tài sản lớn nhất trong danh sách là: "+ max+"Vị trí của người đó trong danh sách là: "+index);
    }
}
