package chap13_generic.sec07.exam01_generic_extends_implement;

public interface 보관소<T> {
    public void 추가(T item, int index);

    public T get(int index);
}
