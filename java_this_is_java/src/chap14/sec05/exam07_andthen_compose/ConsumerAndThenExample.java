package chap14.sec05.exam07_andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args) {
        Consumer<Member> consumerA = m -> {
            System.out.println("consumerA: " + m.getName());
        };

        Consumer<Member> consumerB = m -> {
            System.out.println("consumerB: " + m.getId());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("홍길동", "IdHong", null));
//        실행 결과
//        consumerA: 홍길동
//        consumerB: IdHong

        Consumer<Member> consumerAC = consumerB.andThen(consumerA);
        consumerAC.accept(new Member("홍길동", "IdHong", null));
//        실행 결과
//        consumerB: IdHong
//        consumerA: 홍길동
    }
}
