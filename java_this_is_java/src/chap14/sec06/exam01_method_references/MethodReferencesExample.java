package chap14.sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        //정적 메소드 참도
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과1 : " + operator.applyAsInt(1, 2));
        //결과1 : 3

        operator = Calculator::staticMethod;
        System.out.println("결과2 : " + operator.applyAsInt(3, 4));
        //결과2 : 7

        //인스턴스 메소드 참조
        Calculator obj = new Calculator();
        operator = (x,y) -> obj.instanceMethod(x, y);
        System.out.println("결과3 : " + operator.applyAsInt(5,6));
        //결과3 : 11

        operator = obj::instanceMethod;
        System.out.println("결과3 : " + operator.applyAsInt(7,8));
        //결과4 : 15
    }
}
