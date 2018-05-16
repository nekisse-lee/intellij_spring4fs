package chap06.constructor;

public class InstanceMemberCarExample {
    public static void main(String[] args) {
    InstanceMemberCar myCar = new InstanceMemberCar("포르쉐");
    InstanceMemberCar yourCar = new InstanceMemberCar("아반떼");

        myCar.run();

        yourCar.setSpeed(1);
        yourCar.run();

    }



}
