package chap11.sec11.exam01_arrays;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"가나다", "가나"};
        String[] arr2 = new String[]{"가나다", "가나"};
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println("equals = " + equals);
    }


}
