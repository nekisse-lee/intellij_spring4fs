package chap03;

public class FromIntToFloat {
    public static void main(String[] args) {

        byte a = 10;

        byte result = (byte) (a + a);
    int num1 = 123456780;
    int num2 = 123456780;
        System.out.println(num2);
    float num3 = num2;


        double num4 = num1;

        num2 = (int) num3;
        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num4);

        num1 = (int) num4;
        System.out.println(num1);

    }

}
