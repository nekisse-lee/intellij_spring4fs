package chap07extends.Vehicle;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive(new Bus());
        driver.drive(new Texi());
        driver.drive(new Vehicle());


    }
}
