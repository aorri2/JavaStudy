package lambda;

public class Student {
    private String name;
    private int mathScore;
    private int koreanScore;

    public Student(String name, int mathScore, int koreanScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.koreanScore = koreanScore;
    }

    public String getName() {
        return name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mathScore=" + mathScore +
                ", koreanScore=" + koreanScore +
                '}';
    }
}
