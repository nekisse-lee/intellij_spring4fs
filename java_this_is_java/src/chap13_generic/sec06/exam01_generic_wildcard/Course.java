package chap13_generic.sec06.exam01_generic_wildcard;

public class Course<T> {
    private String 수강코스명;
    private T[] 수강인원;

    public Course(String 수강코스명, int capacity) {
        this.수강코스명 = 수강코스명;
        //T가 결정이 안된상태에서 배열을 생성할수 없다.
        //수강인원 = new T[capacity]    (x)
        수강인원 = (T[]) (new Object[capacity]);
    }

    public String get수강코스명() { return 수강코스명; }
    public T[] get수강인원() { return 수강인원; }

    public void add(T t) {
        for (int i = 0; i < 수강인원.length; i++) {
            if (수강인원[i] == null) {
                수강인원[i] = t;
                break;
            }
        }
    }
}
