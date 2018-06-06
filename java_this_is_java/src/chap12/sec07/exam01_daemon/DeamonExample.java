package chap12.sec07.exam01_daemon;

public class DeamonExample {
    public static void main(String[] args) {

        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);

        autoSaveThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) { }

        System.out.println("메인 스레드 종료");
        boolean daemon = autoSaveThread.isDaemon();
        System.out.println("daemon = " + daemon);
    }
}
