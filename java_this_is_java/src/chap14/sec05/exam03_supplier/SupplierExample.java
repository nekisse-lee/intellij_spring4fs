package chap14.sec05.exam03_supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args) {

        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };
        System.out.println("주사위 1~6중의 수: = " + intSupplier.getAsInt());
        System.out.println("주사위 1~6중의 수: = " + intSupplier.getAsInt());
        System.out.println("주사위 1~6중의 수: = " + intSupplier.getAsInt());
        //외에 DoubleSupplier, BooleanSupplier, LongSupplier 등등이 있다.
    }
}
