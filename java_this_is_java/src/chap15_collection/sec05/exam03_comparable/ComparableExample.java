package chap15_collection.sec05.exam03_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("김나박", 45));
        treeSet.add(new Person("나얼", 25));
        treeSet.add(new Person("박효신", 31));

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name + ": " + person.age);
        }
    }
}
