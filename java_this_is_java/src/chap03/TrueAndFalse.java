package chap03;

public class TrueAndFalse {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 2;

        boolean result = a != b;
        boolean result2 = a != c;
        System.out.println(result);
        System.out.println(result2);

        char A = 'A';
        char B = 'B';

        boolean result3 = A == B;
        boolean result4 = A != B;
        System.out.println(result3);
        System.out.println(result4);

        int AA = A;
        System.out.println(AA);

        boolean charResult = AA != A;
        System.out.println(charResult);

        boolean asd= AA == 66;
        System.out.println(asd);

        System.out.println("---------------");

        float F1 = 1.1F;
        float F2 = 1.1F;
        boolean F3 = F1 == F2;
        System.out.println(F3);

        System.out.println("-------------String-----------------");

        String str1 = "nekisse";
        String str2 = "nekisse";
        String str3 = new String("nekisse");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    }
}
