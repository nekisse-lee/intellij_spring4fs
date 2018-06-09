package chap13_generic.sec07.exam01_generic_extends_implement;

public class 자식제품<K,V,C> extends 제품<K, V> {
        private C 회사;

    public C get회사() {
        return 회사;
    }

    public void set회사(C 회사) {
        this.회사 = 회사;
    }
}
