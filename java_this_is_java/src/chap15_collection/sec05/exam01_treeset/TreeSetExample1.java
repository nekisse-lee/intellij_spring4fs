package chap15_collection.sec05.exam01_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(95);
        scores.add(80);

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 점수: " + score);

        score = scores.last();
        System.out.println("가장 높은 점수: " + score + "\n");

        score = scores.lower(95);
        System.out.println("95점 아래 점수: " + score);

        score = scores.higher(95);
        System.out.println("95점 위의 점수: " + score);

        score = scores.floor(new Integer(95));
        System.out.println("95점 이거나 바로 아래 점수: " + score);

        score = scores.ceiling(new Integer(85));
        System.out.println("85점 이거나 바로 위의 점수: " + score);

        while (!scores.isEmpty()) {
            score = scores.pollFirst();   //왼쪽 객체 부터 결과를 가져오고 Set에서 지워버린다.  오름차순
                            // pollLast();   //오른쪽 객체부터 결과를 가져옴. 내림차순
            System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
        }

        Iterator<Integer> integerIterator = scores.iterator();
        while (integerIterator.hasNext()) {
            int s = integerIterator.next();  //결과를 가져오기만한다.
            integerIterator.remove();   //  결과를 지운다.
            System.out.println(s + "(남은 객체 수: " + scores.size() + ")");
        }
    }
}
