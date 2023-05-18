package ss8.bai_tap.TennisGame;

public class TennisGame {

    public static String getScore(int scoreOfPlayerFirst, int scoreOfPlayerSecond) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        final int ZERO_POINT = 0;
        final int ONE_POINT = 1;
        final int TWO_POINT = 2;
        final int THREE_POINT = 3;
        if (advantagePoint(scoreOfPlayerFirst, scoreOfPlayerSecond)) {
            score = new StringBuilder(getAdvantage(scoreOfPlayerFirst, scoreOfPlayerSecond));
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreOfPlayerFirst;
                else {
                    score.append("-");
                    tempScore = scoreOfPlayerSecond;
                }
                switch (tempScore) {
                    case ZERO_POINT:
                        score.append("Love");
                        break;
                    case ONE_POINT:
                        score.append("Fifteen");
                        break;
                    case TWO_POINT:
                        score.append("Thirty");
                        break;
                    case THREE_POINT:
                        score.append("Forty");
                        break;
                    default:
                        score = new StringBuilder("Deuce");
                        break;
                }
            }
        }
        return score.toString();
    }

    private static boolean advantagePoint(int scoreOfPlayerFirst, int scoreOfPlayerSecond) {
        return scoreOfPlayerFirst >= 4 && scoreOfPlayerFirst != scoreOfPlayerSecond || scoreOfPlayerSecond >= 4 && scoreOfPlayerFirst != scoreOfPlayerSecond;
    }

    private static String getAdvantage(int scoreOfPlayerFirst, int scoreOfPlayerSecond) {
        String score;
        int minusResult = scoreOfPlayerFirst - scoreOfPlayerSecond;
        if (minusResult == 1) score = "Advantage ";
        else if (minusResult == -1) score = "Advantage second player";
        else if (minusResult >= 2) score = "Win for first player";
        else score = "Win for second player";
        return score;
    }
}