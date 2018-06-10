package chap14.sec03.exam02_arguments;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {

        MyFunctionalInterface fi;

        fi = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);   //실행 결과 10


        fi = (x) -> System.out.println(x * 5);     //실행문이 하나일 경우 중괄호 생략 {}
        fi.method(2);   //실행 결과 10

        fi = x -> System.out.println(x * 5);        //매개변후가 하나일 경우  괄호() 생략
        fi.method(2);   //실행 결과 10
    }
}

