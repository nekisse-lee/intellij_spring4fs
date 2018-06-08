package chap13_generic;

public class testBox {
        private Object object;
        public Object getObject() { return object; }
        public void setObject(Object object) { this.object = object; }

    public static class Box<T> {
        private T t;
        public T getT() { return t; }
        public void setT(T t) { this.t = t; }
    }

    public static void main(String[] args) {
        testBox box = new testBox();
        box.setObject("hello");                 //String 타입을 Object 타입으로 자동 타입 변환 후 저장
        String str = (String) box.getObject();  //Object 타입을 String 타입으로 강제 타입 변환 후 얻음


    }
}
