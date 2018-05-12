package chap03;

public class Exercise04 {
    public static void main(String[] args) {
        boolean start = true;
        int count = 0;
        while (start) {
            int a = (int) (Math.random() * 6 + 1);
            int b = (int) (Math.random() * 6 + 1);
            System.out.println(a + "," + b);
            count++;
            if ((a + b) == 5) {
                start = false;
            }
        }
        System.out.println(count);
    }
}
