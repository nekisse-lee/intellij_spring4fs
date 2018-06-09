package chap13_generic.sec05.exam01_bounded_type;

public class test_BoundedTypeParameter {
    static class testUtil {
        static <T extends Number> int compare(T t1, T t2) {// 파라미터를 Number 타입으로 제한
            double v1 = t1.doubleValue();
            double v2 = t2.doubleValue();
            return Double.compare(v1, v2);
            //Double.compare 메소드는 v1이 v2보다 크면 1,  작으면 -1 같으면 0을 리턴
        }
    }
    public static void main(String[] args) {
        //testUtil 클래스의 compare 메소드를 이용   문자열을 사용했기때문에 에러발생
        //int result = testUtil.compare("a", "b");

        //정상적인 코드
        int result1 = testUtil.compare(5, 1);
        System.out.println("result1의 결과 = " + result1);
        int result2 = testUtil.compare(2.5, 5);
        System.out.println("result2의 결과 = " + result2);
        int result3 = testUtil.compare(3.3, 3.3);
        System.out.println("result3의 결과 = " + result3);
    }
}
