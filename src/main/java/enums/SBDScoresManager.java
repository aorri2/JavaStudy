package enums;

public class SBDScoresManager {
    public int getSBDScores(SBDScores sbdScores) {
        int score = 0;
        System.out.println(sbdScores);
        switch (sbdScores) {
            case THREEHUNDRED:
                score = 300;
                break;
            case FOURHUNDRED:
                score = 400;
                break;
            case FIVEHUNDRED:
                score = 500;
                break;
        }
        return score;
    }

    public static void main(String[] args) {
        SBDScoresManager sbdScoresManager = new SBDScoresManager();
        int sbdScores = sbdScoresManager.getSBDScores(SBDScores.FIVEHUNDRED);
        System.out.println("당신의 3대는 : "+sbdScores);
    }
}
