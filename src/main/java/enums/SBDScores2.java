package enums;

public enum SBDScores2 {
    FIVEHUNDRED(500),
    FOURHUNDRED(400),
    THREEHUNDRED(300);
    int score;

    SBDScores2(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

