package chap12.sec02.exam01_createdthread;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {

        //how1
        /*Runnable beepTeak = new BeepTask();
        Thread thread = new Thread(beepTeak);
        thread.start();*/


        //how2
        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 비프음을 5번 반복해서 소리나게 하는 작업
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try { Thread.sleep(500); } catch (Exception e) { }
                }
            }
        });
        thread.start();*/


        //how3
        Thread thread = new Thread(() ->{
            // 비프음을 5번 반복해서 소리나게 하는 작업
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try { Thread.sleep(500); } catch (Exception e) { }
            }
        });
        thread.start();




    }
}
