package chap09.sec03.exam03_localclass_access;

public class Outter {


    //자바7이전           final없을시 에러
    public void method1(final int arg) {
        //자바7이전           final없을시 에러

        final int localVariable = 1;
        class Inner {
            int result;
            void method() {
                //int arg   복사
                //int localVariable 복사
                this.result = arg + localVariable;
                System.out.println(result);
            }
        }
    }



    //자바8이후      final 생략
    public void method2(int arg) {
        int localVariable = 1;
        class Inner{
            Inner inner = new Inner();
            int result;
            void method() {
                 this.result = arg + localVariable;
                System.out.println(result);
            }
        }
    }

    public void method3(int arg) {
        int localVariable = 1;
        class Inner{
            int result;
            void method() {
                this.result = arg + localVariable;
                System.out.println(result);
            }
        }
        new Inner().method();
    }



}
