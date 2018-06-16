package chap15_collection.sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail","김나박"));
        messageQueue.offer(new Message("sendSMS","나얼"));
        messageQueue.offer(new Message("sendKakaotalk","박효신"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail" :
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS" :
                    System.out.println(message.to + "님에게 SMS을 보냅니다.");
                    break;
                case "sendKakaotalk" :
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
