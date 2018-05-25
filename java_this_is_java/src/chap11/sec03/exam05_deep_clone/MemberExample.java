package chap11.sec03.exam05_deep_clone;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("홍길동", 25, new int[]{90, 90}, new Car("소나타"));

        Member cloned = original.getMember();

        cloned.scores[0] = 100;
        cloned.car.model = "그랜저";

        System.out.println("original.toString() = " + original.toString());

        System.out.println("cloned.toString() = " + cloned.toString());
        for (int i = 0; i < cloned.scores.length; i++) {
            System.out.println(cloned.scores[i]);

        }
    }
}
