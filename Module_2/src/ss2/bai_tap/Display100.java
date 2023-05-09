package ss2.bai_tap;

public class Display100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (Display.check(i)) {
                System.out.println(i);
            }
        }
    }
}


//        for (int i = 2; i < 100; i++) {
//            int count = 0;
//            for (int j = 1; j < i; j++) {
//
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println("Cac snt laf" + i);
//            }
//        }
