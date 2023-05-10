package ss2.thuc_hanh;

import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        int x = -1, a[] = {1,2,3,4};
        for(int i=0;i<a.length;i++){
            if(a[i] < x){
                x = a[i];
            }
        }
        System.out.println(x);
    }
}
//    int[] array = {10, 4, 6, 7, 8, 6};
//    int numberX;
//    Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập phần tử cần xóa: ");
//                numberX = scanner.nextInt();
//                for (int i = 0; i < array.length; i++) {
//        if(numberX==array[i]){
//        array[i]=0;
//        }
//        }
//        System.out.println(array);
//        }
