package chap12.sec06.exam05_wait_notify;

public class ConsummerThread extends Thread {
    private DataBox dataBox;

    public ConsummerThread(DataBox dataBox) {
        this.setName("ConsummerThread");
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            String data = dataBox.getData();
        }
    }

}
