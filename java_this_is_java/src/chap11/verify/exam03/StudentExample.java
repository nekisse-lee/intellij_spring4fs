package chap11.verify.exam03;

import java.util.HashMap;

public class StudentExample {
    public static void main(String[] args) {

        HashMap<Student, String> hashMap = new HashMap<>();

        hashMap.put(new Student("1"), "95");

        String score = hashMap.get(new Student("1"));
        System.out.println("1번학생의 총점 : " + score);

    }
}
