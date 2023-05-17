package ss8.bai_tap.TennisGame;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHập điểm người chơi thứ nhất: ");
        int scoreFirstPlayer = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập điểm người chơi thứ hai: ");
        int scoreSecondPlayer = Integer.parseInt(scanner.nextLine());
        System.out.println(TennisGame.getScore(scoreFirstPlayer, scoreSecondPlayer));
    }
}
