package chap13_generic.verify.exam03;

public class Container<K, V> {
    private K key;
    private V value;

    public void setKey(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
