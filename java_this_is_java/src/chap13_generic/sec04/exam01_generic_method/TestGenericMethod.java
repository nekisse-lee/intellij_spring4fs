package chap13_generic.sec04.exam01_generic_method;

public class TestGenericMethod {
    static class Box<T> {    //box 클래스
        private T t;
        public T getT() { return t; }
        public void setT(T t) { this.t = t; }
    }
    static class Util {     // 박스를 이용해 제네릭 메소드가 있는 Util클래스
        public static <T> Box<T> boxing(T t) {
            Box<T> box = new Box<T>();
            box.setT(t);
            return box;
        }
    }
    public static void main(String[] args) {
        //구체적 타입 명시              <Integer>boxing(100)  구체적타입 Integer 명시
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.getT();
        System.out.println(intValue);

        //매개값을 보고 구체적 타입 추정.   홍길동 = String 타입
        Box<String> box2 = Util.boxing("홍길동");
        String strValue = box2.getT();
        System.out.println("strValue = " + strValue);

    }
}
