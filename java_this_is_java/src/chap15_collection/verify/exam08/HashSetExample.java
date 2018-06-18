package chap15_collection.verify.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();
        set.add(new Student(1, "김나박"));
        set.add(new Student(2, "김범수"));
        set.add(new Student(1, "나얼"));

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.studentnum + " : " + student.name);
        }

    }
}
