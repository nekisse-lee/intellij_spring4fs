package chap07extends.sec08.exam02_abstract_method;

abstract public class Animal {
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();
}
