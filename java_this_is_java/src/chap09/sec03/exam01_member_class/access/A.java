package chap09.sec03.exam01_member_class.access;

public class A {
    class B{}
    static  class C{}

    //인스턴스필드
    B field1 = new B();
    C filed2 = new C();

    //인스턴스메소드
    void method1() {
        B var1 = new B();
        C var2 = new C();
    }

    //정적필드
    //static B field3 = new B();
    static C field4 = new C();

    //정적메소드
    static void method2() {
//        B var1 = new B();
        C var2 = new C();
    }


}
