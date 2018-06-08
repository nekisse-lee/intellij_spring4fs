package chap12.sec09.verify.exam08_interrupted;

public class ThreadExample {
    public static void main(String[] args) {

        Thread thread = new MovieThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //    interrupt() 실행   일정지가 되면 InterruptedException 발생
        thread.interrupt();

    }
}
