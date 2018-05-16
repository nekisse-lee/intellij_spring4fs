package chap06.geterandsetter;

public class CarExample {
    public static void main(String[] args) {


        Car car = new Car();

        car.setSpeed(-50);
        System.out.println("현재속도: " + car.getSpeed());

        car.setSpeed(70);


        if (!car.isStop()) {
            car.setStop(true);
        }

        System.out.println("현재 속도: " + car.getSpeed());

    }
}
