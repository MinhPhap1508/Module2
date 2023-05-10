package ss3.bai_tap;

public class ThuatToan {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 6 * 2 - 1; j++) {
                if (6 - i - 1 == j || j == 6 + i - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < 10 ; j++) {
                if (5 - i  == j || j == 5 + i ) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}