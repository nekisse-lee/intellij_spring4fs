package chap11.sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s = new Student(1, "홍길동");







    }




    static class Student {
        int sno;
        String name;

        public Student(int sno, String name) {
            this.sno = sno;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sno, name);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Student) {
                Student s = (Student) obj;
                if (s.sno == this.sno) {
                    if (s.name == this.name) {
                        return true;
                    }
                }
            }
            return false;
        }
    }


}
