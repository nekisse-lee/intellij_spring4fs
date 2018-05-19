package chap07extends.Ariplane;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {

        SupersonicAirplane sa = new SupersonicAirplane();
        sa.tackOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();

    }
}
