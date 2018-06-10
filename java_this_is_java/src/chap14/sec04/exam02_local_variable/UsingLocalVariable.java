package chap14.sec04.exam02_local_variable;

public class UsingLocalVariable {
    void method(int arg) {
        int localVar = 40;

//        arg = 31;                 수정하려고하면 에러 발생   아래 람다식 내에서 사용했기때문에 final
//        localVar = 20;            수정하려고하면 에러 발생   아래 람다식 내에서 사용했기때문에 final

        MyFunctionalInterface fi = () -> {
            System.out.println("arg = " + arg);     //arg 는 final특성을 가짐
            System.out.println("localVar = " + localVar); //localVar 는 final특성을 가짐
        };
        fi.method();
    }
}
