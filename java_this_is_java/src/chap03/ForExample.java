package chap03;

public class ForExample {
    public static void main(String[] args) {
multiplicationTable();

    }

    public static void multiplicationTable() {
        int a = 0;
        int b = 9;
        int c = 0;
        for (a = 1; a <= b; a++) {
            System.out.println(a + "단");
            for (int d = 1; d <= b; d++) {
                c = a * d;
                System.out.println(a + " x " + d + " = " + c);
            }



        }
    }

    private static void sum5() {
        long sum = 0;

        for (int i = 1; i < 10; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    public static void sum() {
        int sum = 0;
        int i = 0;
        for ( i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1부터 ~ "+ (i-1) +"의 합 = " + sum);

    }
}
