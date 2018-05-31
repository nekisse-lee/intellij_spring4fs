package chap11.sec13.exam01_math;

public class MathRandomExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = (int) ((Math.random() * 6) + 1);
            System.out.println(num);
        }


        System.out.println();

        for (int i = 1; i <= 6; i++) {
            int num = (int) ((Math.random() * 45) + 1);
            System.out.println(i + "번째 로또 번호 = " + num);

        }
    }
}
