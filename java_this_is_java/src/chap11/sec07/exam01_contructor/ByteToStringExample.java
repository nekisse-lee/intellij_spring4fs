package chap11.sec07.exam01_contructor;

public class ByteToStringExample {
    public static void main(String[] args) {

        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

        String str1 = new String(bytes);
        System.out.println("str1 = " + str1);

        for (byte aByte : bytes) {
            System.out.println("aByte = " + aByte);
            char a = (char) aByte;
            System.out.println("a = " + a);
        }

    }
}
