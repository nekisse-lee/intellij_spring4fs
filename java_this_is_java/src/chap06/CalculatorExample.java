package chap06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.areaRectangle(10);

        double result2 = calculator.areaRectangle(10, 20);

        System.out.println(result);
        System.out.println(result2);
    }
}
