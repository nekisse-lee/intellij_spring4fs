package chap13_generic.sec04.exam02_generic_method;

public class CompareMethodExample {
    public static void main(String[] args) {
        //두개의 Pair객체 생성
        Pair<Integer, String> p1 = new Pair<>(1, "사과");
        Pair<Integer, String> p2 = new Pair<>(1, "사과");
        // 구체적 타입 명시.. 두개의 페어 객체를 비교
        Util.<Integer,String>compare(p1, p2);

        //매개값을 보고 구체적 타입 추정,  new Pair<>(1, "사과")     1 =Integer 타입 , "사과" = String 타입
        boolean result1 = Util.compare(p1, p2);
        if (result1) {
            System.out.println("논리적으로 동등합니다.");
        } else {
            System.out.println("논리적으로 동등하지 않습니다.");
        }
    }
}
