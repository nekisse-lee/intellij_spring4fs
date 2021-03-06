package chap11.sec07.exam02_method;

import sun.nio.cs.ext.EUC_KR;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
    public static void main(String[] args) {
        String str = "안녕하세요";

        byte[] bytes1 = str.getBytes();
        System.out.println("bytes1.length = " + bytes1.length);

        String str1 = new String(bytes1);
        System.out.println("bytes1 -> str1: " + str1);


        try {
            byte[] bytes2 = str.getBytes("EUC-KR");
            System.out.println("bytes2 = " + bytes2.length);
            String str2 = new String(bytes2, "EUC-KR");
            System.out.println("str2 = " + str2);
            System.out.println();

            byte[] bytes3 = str.getBytes("UTF-8");
            System.out.println("bytes3(UTF-8) = " + bytes3.length);
            String str3 = new String(bytes3, "EUC-KR");
            System.out.println("str3(UTF-8) = " + str3);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
