package ss13.thuc_hanh;

import java.util.Scanner;

public class IllustrationBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list= new int[size];
        System.out.println("Enter "+list.length+"Values:");
        for (int i = 0; i < list.length; i++) {
            list[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"\t");
        }
    }
 public static void bubbleSortByStep(int []list){
        boolean nedNextPass=true;
 }
}
