package chap13_generic.sec07.exam01_generic_extends_implement;

public class 보관소Impl<T> implements 보관소<T> {

    private T[] array;

    public 보관소Impl(int capacity) {
        this.array = (T[]) (new Object[capacity]);
    }

    @Override
    public void 추가(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
