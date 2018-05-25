package chap11.sec03.exam03_toString;

import java.util.Date;

public class ToStringExample {
    public static void main(String[] args) {

        Object obj1 = new Object();
        Date obj2 = new Date();

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2.toString());

    }
}
