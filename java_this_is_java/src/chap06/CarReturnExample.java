package chap06;

public class CarReturnExample {
    public static void main(String[] args) {
        CarReturn myCar = new CarReturn();

        myCar.setGas(5);

        boolean gasstate = myCar.isLeftGas();
        if (gasstate) {
            System.out.println("출발합니다.");
            myCar.run();
        }

        if (myCar.isLeftGas()) {
            System.out.println("가스를 주입 해야 합니다.");
        } else {
            System.out.println("gas를 주입하세요");
        }
    }
}
