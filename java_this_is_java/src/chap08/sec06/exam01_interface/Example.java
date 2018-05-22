package chap08.sec06.exam01_interface;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA();


        InterfaceC ic = impl;
        impl.methodA();
        impl.methodB();
        impl.methodC();
    }
}
