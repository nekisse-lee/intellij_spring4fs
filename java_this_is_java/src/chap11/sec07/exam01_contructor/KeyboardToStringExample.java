package chap11.sec07.exam01_contructor;

import java.io.IOException;

public class KeyboardToStringExample {
    public static void main(String[] args) throws Exception {

        byte[] bytes = new byte[100];
        System.out.print("입력: ");

        int readByteNo = System.in.read(bytes);

        String str = new String(bytes, 0, readByteNo - 1);
        System.out.println("str = " + str);
        char c = str.charAt(3);
        System.out.println("c = " + c);

    }
}
