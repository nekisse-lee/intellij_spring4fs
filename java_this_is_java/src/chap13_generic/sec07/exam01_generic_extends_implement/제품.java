package chap13_generic.sec07.exam01_generic_extends_implement;

public class 제품<T, M> {
    private T 종류;
    private M 모델;

    public T get종류() { return 종류; }

    public void set종류(T 종류) {
        this.종류 = 종류;
    }

    public M get모델() {
        return 모델;
    }

    public void set모델(M 모델) {
        this.모델 = 모델;
    }
}


class Tv{}

