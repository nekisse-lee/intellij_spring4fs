package chap12.sec02.exam02_threadname;

public class ThreadNameExample {
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println("프로그램 시작 스레드 이름 = " + name);

        Thread threadA = new ThreadA();
        System.out.println("threadA를 생성한 스레드: " + Thread.currentThread().getName());
        System.out.println("작업 스레드 이름 : " + threadA.getName());
        threadA.start();

        // threadA.start();  // start() 재사용 불가

        Thread threadB = new ThreadB();
        System.out.println("threadB를 생선한 스레드: " + Thread.currentThread().getName());
        System.out.println("작업 스레드 이름 : " + threadB.getName());
        threadB.start();
    }
}
