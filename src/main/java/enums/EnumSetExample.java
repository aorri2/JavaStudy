package enums;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {
    public static void main(String[] args) {
        Set<SBDScores2> set = EnumSet.of(SBDScores2.FIVEHUNDRED,SBDScores2.FOURHUNDRED,SBDScores2.THREEHUNDRED,SBDScores2.FIVEHUNDRED,SBDScores2.THREEHUNDRED);
        //각 요소들을 순회
        for (SBDScores2 score : set) {
            System.out.println(score);
        }

        Set<SBDScores2> set1 = EnumSet.allOf(SBDScores2.class);
        System.out.println("set1 = "+set1);

        Set<SBDScores2> set2 = EnumSet.noneOf(SBDScores2.class);
        System.out.println("set2 = "+set2);

    }
}
