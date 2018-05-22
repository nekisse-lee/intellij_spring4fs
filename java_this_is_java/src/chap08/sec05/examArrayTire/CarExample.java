package chap08.sec05.examArrayTire;

import chap08.sec05.examTire.HankookTire;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tires[0] = new HankookTire();
        myCar.tires[1] = new HankookTire();

        myCar.run();
    }
}
