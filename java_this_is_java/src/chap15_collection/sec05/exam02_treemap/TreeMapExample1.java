package chap15_collection.sec05.exam02_treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(new Integer(87), "김나박");
        scores.put(new Integer(98), "김범수");
        scores.put(new Integer(75), "나얼");
        scores.put(new Integer(95), "박정현");
        scores.put(new Integer(80), "김연우");

        Map.Entry<Integer,String > entry = null;

        entry = scores.firstEntry();
        System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

        entry = scores.lastEntry();
        System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

        entry = scores.lowerEntry(95);   //95 아래의 점수
        System.out.println("95 아래 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

        entry = scores.higherEntry(95);   //95 위의 점수
        System.out.println("95 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

        entry = scores.floorEntry(new Integer(95));
        System.out.println("95점 이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

        entry = scores.ceilingEntry(new Integer(95));
        System.out.println("95점 이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");

        while (!scores.isEmpty()) {
            entry = scores.pollFirstEntry();          //오름차순
            System.out.println(entry.getKey() + "-" + entry.getValue()+ "(남은 객체 수: " + scores.size() + ")");
        }
    }
}
