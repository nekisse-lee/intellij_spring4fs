package chap15_collection.verify.exam08;

public class Student {
    public int studentnum;
    public String name;

    public Student(int studentnum, String name) {
        this.studentnum = studentnum;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        if (studentnum != student.studentnum) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return studentnum;
    }
}
