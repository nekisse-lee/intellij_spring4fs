package chap14.verify.exam06;

import java.util.function.ToIntFunction;

public class LambdaExample {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("김나박", 95, 93)
    };

    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("영어평균점수 = " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("수학평균점수 = " + mathAvg);
    }

    private static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : students) {
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum /students.length;
        return avg;

    }

}
