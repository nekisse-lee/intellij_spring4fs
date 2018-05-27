package chap11.sec06.exam02_reflection;

public class Car {

    private String model;
    private System owner;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public System getOwner() {
        return owner;
    }

    private void setOwner(System owner) {
        this.owner = owner;
    }
}
