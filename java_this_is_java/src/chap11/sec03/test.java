package chap11.sec03;

public class test {
    test tesst = new test();

    public static int a = 1;

    public  static int b = 2;


    public static void main(String[] args) {
        int d = Integer.compare(a, b);


        System.out.println(d);
        Object test = null;

        String s = null;
        try {
            s = test.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(s);


    }

}
