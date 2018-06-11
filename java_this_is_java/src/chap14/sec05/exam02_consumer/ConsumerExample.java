package chap14.sec05.exam02_consumer;

import java.util.function.*;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer =
                s -> System.out.println("s + \"8\" = " + s + "8");
        consumer.accept("JAVA");

        BiConsumer<String, String> biConsumer =
                (s, s2) -> System.out.println("s + s2 = " + s + s2);
        biConsumer.accept("Java","8");

        DoubleConsumer doubleConsumer =
                value -> System.out.println("Java" + value);
        doubleConsumer.accept(7.0);

        ObjIntConsumer<String> objIntConsumer =
                (s, value) -> System.out.println("s + value = " + s + value);
        objIntConsumer.accept("JAVA", 8);
    }
}
