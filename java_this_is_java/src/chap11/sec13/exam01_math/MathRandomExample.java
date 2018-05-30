package chap11.sec13.exam01_math;

public class MathRandomExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = (int) ((Math.random() * 6) + 1);
            System.out.println(num);
        }
    }
}
