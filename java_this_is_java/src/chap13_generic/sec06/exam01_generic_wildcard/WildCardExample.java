package chap13_generic.sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
    // 수강코스의  코슴이름과  수강중인 사람들을 보여주는 메서드들     * 메서드 타입 파라미터가 다름 *
    static void registerCourse(Course<?> course) {
        System.out.println("registerCourse()메서드의 [ " + course.get수강코스명() + " ]  수강생: " + Arrays.toString(course.get수강인원()));

    }

    // Student 상위 타입을 제한
    static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println("registerCourseStudent()메서드의 [ " + course.get수강코스명() + " ] 수강생: " + Arrays.toString(course.get수강인원()));
    }

    // Worker 하위 타입을 제한
    static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println("registerCourseWorker()메서드의 [ " + course.get수강코스명() + " ] 수강생: " + Arrays.toString(course.get수강인원()));
    }


    public static void main(String[] args) {

        Course<Person> personCourse = new Course<Person>("사람이면 가능한 과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
        workerCourse.add(new Worker("직장인"));
        workerCourse.add(new Worker("직장인"));
        //workerCourse.add(new Student("학생"));      불가능


        Course<Student> studentCourse = new Course<>("학생 과정", 5);
        studentCourse.add(new HighStudent("고등학생"));
        studentCourse.add(new Student("학생"));
        //studentCourse.add(new Person("일반인"));      불가능

        Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));
        //highStudentCourse.add(new Student("학생")); 불가능

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);

        //상위 타입을 제한했으므로 하위타입인  highStudentCourse 와 studentCourse 사용가능
//        registerCourseStudent(personCourse);  불가능
//        registerCourseStudent(workerCourse);  불가능
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);

        //하위 타입을 제한했으므로 상위타입인  PersonCourse 와 workerCourse 사용가능
        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
//        registerCourseWorker(studentCourse);       불가능
//        registerCourseWorker(highStudentCourse);   불가능


    }
}
