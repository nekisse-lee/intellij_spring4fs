package chap12.sec04.exam02_syncronized;

public class User1 extends Thread {

    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User1");
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(100);

    }
}
