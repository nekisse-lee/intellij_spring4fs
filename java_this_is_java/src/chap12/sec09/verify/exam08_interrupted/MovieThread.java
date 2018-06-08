package chap12.sec09.verify.exam08_interrupted;

public class MovieThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("동영상을 재생합니다.");
            // 방법 1
            //  Thread.sleep(1000)  일지 정지 상태로 만듬.
            // 일시정지가되면 InterruptedException 발생
            // catch부분에서 break; 실행
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }

            //방법 2
            //  this.isInterrupted()
            if (Thread.interrupted()) {
                break;
            }

        }
    }
}
