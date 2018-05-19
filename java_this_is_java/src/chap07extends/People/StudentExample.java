package chap07extends.People;

public class StudentExample {
    public static void main(String[] args) {

        Student student = new Student("홍길동", "111111-1111", 1);
        System.out.println("name : " + student.name);
        System.out.println("ssn " + student.ssn);

        System.out.println("studentNo : " + student.studentNo);

    }
}
