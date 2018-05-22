package chap08.sec05.exam03_method_polymorphism;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.drive(new Bus());
        driver.drive(new Texi());


        Bus bus = new Bus();
        Texi texi = new Texi();

        driver.drive(bus);
        driver.drive(texi);

    }
}
