package chap03;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;

        int vlaueaa = '가';
        char ch = (char) vlaueaa;
        System.out.println(ch);

        int i = ch;

        int j = vlaueaa;
        System.out.println(j);
        System.out.println(i);


        if (stop) {
            System.out.println("중지");
        } else {
            System.out.println("시작");
        }
    }
}
