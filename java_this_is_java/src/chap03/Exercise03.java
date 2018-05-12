package chap03;

public class Exercise03 {
    public static void main(String[] args) {
        A();
        B();
    }

    private static void B() {
        int sum = 0;
        int a = 1;
        while (a <= 100) {
            if (a % 3 == 0) {
                sum += a;
            }
            a++;
        }
        System.out.println(sum);

    }

    private static void A() {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
