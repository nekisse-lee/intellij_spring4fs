package chap11.sec07.exam02_method;

public class StringReplaceExample {
    public static void main(String[] args) {
        String oldstr = "자바는 객체지향 언어입니다.";
        String newStr = oldstr.replace("자바", "JAVA");
        System.out.println("newStr = " + newStr);

        System.out.println("oldStr.hashCode() = " + oldstr.hashCode());
        System.out.println("newStr.hashCode() = " + newStr.hashCode());
    }
}
