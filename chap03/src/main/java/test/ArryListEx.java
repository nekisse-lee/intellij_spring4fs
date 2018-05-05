package test;

import java.util.*;

public class ArryListEx {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(10);

        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        System.out.print(list2.toArray());
    }
}
