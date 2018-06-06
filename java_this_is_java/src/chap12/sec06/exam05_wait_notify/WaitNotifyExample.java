package chap12.sec06.exam05_wait_notify;

public class WaitNotifyExample {
    public static void main(String[] args) {

        DataBox dataBox = new DataBox();

        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsummerThread consummerThread = new ConsummerThread(dataBox);

        producerThread.start();
        consummerThread.start();


    }
}
