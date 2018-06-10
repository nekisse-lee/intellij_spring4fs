package chap14.sec03.exam01_no_argument_no_return;

                      //하나의 추상 메소드만을 가지는지 컴파일러가 체크하도록 함
@FunctionalInterface  // 두 개 이상의 추상 메소드가 선언되어 있으면 컴파일 오류 발생
public interface MyFunctionalInterface {
    public void method();
//    public void method2();  주석을 해제하면 컴파일 오류 발생
}
