package chap11.sec03.exam04_clone;

public class MemberExample {
    public static void main(String[] args) {

        Member original = new Member("blue", "홍길동", "12345", 25, true);

        Member cloned = original.getMember();


        System.out.println("원본객체");
        System.out.println("original.toString() = " + original.toString());
        
        System.out.println("복제객체");
        System.out.println("cloned.toString() = " + cloned.toString());

        original.name = "이미자";
        System.out.println("original.toString() = " + original.toString());

        original.age = 3;
        System.out.println("original.toString() = " + original.toString());


    }
}
