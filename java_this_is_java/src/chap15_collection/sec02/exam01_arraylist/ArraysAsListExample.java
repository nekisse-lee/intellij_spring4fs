package chap15_collection.sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("김나박", "김범수", "박효신");
        for (String name : list1) {
            System.out.println("name = " + name);
        }

        List<Integer> list2 = Arrays.asList(new Integer(1), 2, 3);
        for (int value : list2) {
            System.out.println("value = " + value);
        }
    }
}
