package chap06.annotation;

public class Service {
    @PrintAnnotaion()
    public void method1() {
        System.out.println("실행 내용1");
    }

    @PrintAnnotaion(value = "*", number = 5)
    public void method2() {
        System.out.println("실행 내용2");
    }

    @PrintAnnotaion(value = "#", number = 20)
    public void method3() {
        System.out.println("실행 내용3");
    }
    @PrintAnnotaion( value = "^", number = 3)
    public void method4() {
        System.out.println("실행 내용1");
    }


}
