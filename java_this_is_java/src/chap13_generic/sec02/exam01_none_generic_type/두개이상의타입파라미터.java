package chap13_generic.sec02.exam01_none_generic_type;

public class 두개이상의타입파라미터<T, M> {
    private T kind;
    private M model;

    public T getKind() { return kind; }
    public void setKind(T kind) { this.kind = kind; }

    public M getModel() { return model; }
    public void setModel(M model) { this.model = model; }

    static class Car {
    }

    static class Tv {
    }

    public static void main(String[] args) {
        // 제네릭 을 사용사여 생성시 Tv 타입과 String 타입을 지정후 set, get 실행
        두개이상의타입파라미터<Tv, String> product1 = new 두개이상의타입파라미터<>();
        product1.setKind(new Tv());
        product1.setModel("스마트 TV");
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        // 제네릭 을 사용사여 생성시 Car 타입과 String 타입을 지정후 set, get 실행
        두개이상의타입파라미터<Car, String> product2 = new 두개이상의타입파라미터<>();
        product2.setKind(new Car());
        product2.setModel("리어카");
        Car car = product2.getKind();
        String carModel = product2.getModel();
    }



}
