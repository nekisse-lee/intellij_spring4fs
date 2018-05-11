package chap03;

public class WhileExample {
    public static void main(String[] args) {

        sum100();
    }

    private static void sum100() {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
//            System.out.println(i);

            i++;
        }
        System.out.println("1~" + i +"까지의 합 : " + sum);
    }
}
