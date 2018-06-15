package chap14.verify.exam06;

public class Student {
    private String name;
    private int englishScore;
    private int MathScore;

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public Student(String name, int englishScore, int mathScore) {

        this.name = name;
        this.englishScore = englishScore;
        MathScore = mathScore;
    }
}
