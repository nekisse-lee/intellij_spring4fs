package chap13_generic.sec02;

public class TestGenericBox<T> {
        private T t;
        public T getT() { return t; }
        public void setT(T t) { this.t = t; }

    public static void main(String[] args) {
        TestGenericBox<String> stringGecericBox = new TestGenericBox<String>();
        stringGecericBox.setT("hello");
        String  str = stringGecericBox.getT();
    }
}
