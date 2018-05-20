package chap07extends.sec08.exam01_abstract;

public class PhoneExample {
    public static void main(String[] args) {


//        Phone phone = new Phone();


        StartPhone startPhone = new StartPhone("홍길동");

        startPhone.turnOn();
        startPhone.internetSerch();
        startPhone.turnOff();


    }
}
