package chap15_collection.sec02.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String > list1 = new ArrayList<>();
        List<String > list2 = new LinkedList<>();

        long startTime;
        long endTime;

        //특정위치에 데이터를 10000번 삽입시간 차이
        //ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린 시간: " + (endTime-startTime) + " ns");

        //LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린 시간: " + (endTime-startTime) + " ns");
    }
}
