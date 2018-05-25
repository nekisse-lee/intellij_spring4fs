package chap11.sec04.exam01_objects;

import java.util.Objects;

public class EqualsAndDeepExample {
    public static void main(String[] args) {

        Integer o1 = new Integer(1000);
        Integer o2 = 1000;

        System.out.println(Objects.equals(o1, o2));
        System.out.println(Objects.equals(o1, null));
        System.out.println(Objects.equals(null, o1));

        System.out.println(o1.equals(o2));

        System.out.println(Objects.deepEquals(o1,o2));

        int[] arr1 = {1, 2};
        Integer[] arr2 = {1, 2};
        Integer[] arr3 = {1, 2};
        System.out.println();

        System.out.println(Objects.equals(arr1,arr2));
        System.out.println(Objects.equals(arr2,arr3));

        System.out.println();
        System.out.println(Objects.deepEquals(arr1,arr2));
        System.out.println(Objects.deepEquals(arr2,arr3));

        System.out.println();
        System.out.println(Objects.deepEquals(null, arr3));
        System.out.println(Objects.deepEquals(null,null));


    }
}
