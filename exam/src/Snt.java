import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Snt {

    int[] solution(int[][] arr) {
        Set<Integer> integerSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isPrime(arr[i][j])) {
                    integerSet.add(arr[i][j]);
                }
            }
        }
        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        for (TreeSet arr:integerSet) {
            arr[i]+=integerSet[i];
        }
    }
}
