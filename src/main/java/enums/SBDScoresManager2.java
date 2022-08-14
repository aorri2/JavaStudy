package enums;

public class SBDScoresManager2 {
    public static void main(String[] args) {
        System.out.println("당신의 3대는 : " + SBDScores2.FIVEHUNDRED);
        System.out.println("fivehundred.getScore() = " + SBDScores2.FIVEHUNDRED.getScore());

        SBDScores2 fourhundred = SBDScores2.valueOf(SBDScores2.class, "FOURHUNDRED");
        SBDScores2 fivehundred = SBDScores2.valueOf(SBDScores2.class, "FIVEHUNDRED");
        System.out.println("valueof = " + fourhundred);

        System.out.println(fivehundred.compareTo(fourhundred));
        System.out.println(fourhundred.compareTo(fivehundred));



    }
}
