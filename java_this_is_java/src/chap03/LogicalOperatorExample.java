package chap03;

public class LogicalOperatorExample {
    public static void main(String[] args) {

        int charCode = 'a';

        if (charCode >= 65 & charCode <= 90) {
            System.out.println("대문자 이군요");
        }

        if (charCode >= 97 && charCode > 57) {
            System.out.println("소문자");
        }


        byte num1 = 45;
        byte num2 = 25;
        byte result = (byte) (num1 & num2);
        int result2 = num1 & num2;
        System.out.println(result);
        System.out.println(result2);

        int score = 79;
        char grade = score > 80 ? 'A' : 'B';



        System.out.println(grade);
    }
}
