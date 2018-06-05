package chap12.sec05.exam05_state;

public class ThreadStateExample {
    public static void main(String[] args) {

        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
        statePrintThread.run();
    }
}
