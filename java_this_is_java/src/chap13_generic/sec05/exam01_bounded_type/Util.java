package chap13_generic.sec05.exam01_bounded_type;

public class Util {
    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);    // v1이 크면 =1  작으면 =-1 같으면 0
    }
}
