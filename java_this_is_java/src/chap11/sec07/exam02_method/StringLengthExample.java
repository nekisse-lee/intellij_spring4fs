package chap11.sec07.exam02_method;

public class StringLengthExample {
    public static void main(String[] args) {

        String ssn = "7306241230123";

        System.out.println("ssn.length() = " + ssn.length());

        int length = ssn.length();

        if (length == 13) {
            System.out.println("주민번호 자릿 수가 맞습니다.");
        } else {

            System.out.println("주민번호 자릿 수가 틀립니다..");

        }


    }
}
