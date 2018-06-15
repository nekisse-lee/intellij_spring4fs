package chap15_collection.sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("김나박", 85);
        map.put("김범수", 90);  //중복저장 키가 같음
        map.put("박정현", 80);
        map.put("김범수", 95);   //중복저장 키가 같음  새로운 값으로 대체

        System.out.println("총 Entry 수 " + map.size());
        System.out.println(map.get("김범수"));

        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();

        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        map.remove("김범수");
        System.out.println("총 Entry 수 : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value);
        }
        map.clear();      // 전체 삭제
        System.out.println("총 Entry 수 : " + map.size());
    }
}
