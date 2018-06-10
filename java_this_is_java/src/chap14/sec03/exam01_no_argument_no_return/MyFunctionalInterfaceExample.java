package chap14.sec03.exam01_no_argument_no_return;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {

        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();   //실행결과       method call1

        fi = () -> { System.out.println("method call2");};
        fi.method();   //실행결과      method call2

        fi = () -> System.out.println("method call3");  //실행문이 하나 이므로 중괄호 생략
        fi.method();   //실행결과      method call3

        fi = new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("method call4");
            }
        };
        fi.method();  //실행결과      method call4
    }
}
