package chap03;

public class exception {

    public static void main(String[] args) {
        int x = 1;
        double y = 0.0;
        try {
            double z = x / y;
            double c = x % y;
            System.out.println(z);
            System.out.println(c);
            System.out.println(Double.isNaN(c));
            System.out.println(Double.isInfinite(z));

        } catch (RuntimeException e) {
            System.out.println("0으로 나눌 수 없음");
        }

/*
        try {
            int z = x * y;

        }catch ()
*/

    }

}
