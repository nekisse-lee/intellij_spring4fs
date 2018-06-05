package chap11.verify.exam03;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (studentNum.equalsIgnoreCase(getStudentNum())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentNum);
    }*/
}
