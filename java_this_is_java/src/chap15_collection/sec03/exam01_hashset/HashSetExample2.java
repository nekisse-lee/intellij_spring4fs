package chap15_collection.sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("김나박", 30));
        set.add(new Member("김나박", 30));

        // Member클래스의  hashCode()와 equals()를 재정의해서 동등한객체를 만들어 줌으로써
        // 동등한객체.. 때문에 1개의 객체만 저장이됨
        System.out.println("총 객체수" + set.size());
    }
}
