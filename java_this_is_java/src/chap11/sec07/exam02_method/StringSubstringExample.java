package chap11.sec07.exam02_method;

public class StringSubstringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println("firstNum = " + firstNum);

        String secondNum = ssn.substring(7);
        System.out.println("secondNum = " + secondNum);

        System.out.println("ssn.length() = " + ssn.length());

    }

}
