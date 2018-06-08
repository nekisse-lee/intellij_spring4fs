package chap13_generic.sec04.exam02_generic_method;

public class Util {
    //두개의 Pair객체를 받아서 페어 객체의 K,V값을 비교   K와 V가 같다면 true or false
    public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());

        // keyCompare 그리고 valueCompare 가 같으면 true
        return keyCompare && valueCompare;

    }
}
