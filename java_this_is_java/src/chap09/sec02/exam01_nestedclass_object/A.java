package chap09.sec02.exam01_nestedclass_object;

public class A {
    public A() {
        System.out.println("A 객체가 생성됨");

    }

    class B {
        int field1;
        //static int field2;


        public B() {
            System.out.println("B 객체가 생성됨");
        }

        void method1() {
        }
//        static void method2(){}
    }

    static class C {
        int field1;
        static int field2;

        public C() {
            System.out.println("C 객체가 생성됨");
        }

        void method1() {
        }

        static void method2() {
        }
    }

    void method() {
        class D {
            int field1;

            //            static int field2;
            public D() {
                System.out.println("D객체가 생성됨");
            }

            void method1() {}
//            static void method2() {}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
