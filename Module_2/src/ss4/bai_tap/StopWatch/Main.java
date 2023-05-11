package ss4.bai_tap.StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số 1 để bắt đầu: ");
        int enter;
        enter=scanner.nextInt();
        StopWatch stopWatch = new StopWatch();
        if (enter==1) {
            stopWatch.start();
        }
        System.out.print("Nhập số 2 để dừng: ");
        enter=scanner.nextInt();
        if (enter==2) {
            stopWatch.stop();
        }
        System.out.println("Thời gian đã trôi qua: "+stopWatch.getElapsedTime());

    }
}
