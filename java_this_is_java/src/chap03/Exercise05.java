package chap03;

public class Exercise05 {
    public static void main(String[] args) {


        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                if ((4 * a + 5 * b) == 60) {
                    System.out.println("(" + a + "," + b+ ")");
                }
            }
        }

    }
}
