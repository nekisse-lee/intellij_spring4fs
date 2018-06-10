package chap14.sec05.exam01_runnable;

public class RunnableExample {
    public static void main(String[] args) {
        // how1
        Runnable runnable = () ->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        //how2
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        thread2.start();


    }
}
