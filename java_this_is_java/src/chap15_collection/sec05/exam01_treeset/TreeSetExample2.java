package chap15_collection.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(95);
        scores.add(80);

        NavigableSet<Integer> descendingSet = scores.descendingSet();  //내림차순으로 저장된 Set을 얻는다.
        for (Integer score : descendingSet) {
            System.out.print(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> asendingSet = descendingSet.descendingSet();  //내림차순된 것을 뒤바꾼다.
        for (Integer score : asendingSet) {
            System.out.print(score + " ");
        }
    }
}
