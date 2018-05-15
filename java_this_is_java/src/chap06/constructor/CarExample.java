package chap06.constructor;

public class CarExample {
    private static int gas;

    public static void main(String[] args) {

        System.out.println(isLeftGas());

        Car car1 = new Car();

        System.out.println("car1 = " + car1.company);
        System.out.println();


        Car car2 = new Car("자가용");
        System.out.println("car2 = " + car2.company);
        System.out.println("car2 = " + car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3 = " + car3.company);
        System.out.println("car3 = " + car3.model);
        System.out.println("car3 = " + car3.color);
        System.out.println("car3 = " + car3.maxSpeed);

        System.out.println();


        Car car4 = new Car("택시", "검정", 233);
        System.out.println("car4 = " + car4.company);
        System.out.println("car4 = " + car4.model);
        System.out.println("car4 = " + car4.color);
        System.out.println("car4 = " + car4.maxSpeed);

        System.out.println(plus(1, 2));

        System.out.println(sum2(1, 2, 3, 4, 5));

        System.out.println(sum2(1, 2, 3, 4, 5));



    }


    private static  boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("가스 부족");
            return false;
        }
        System.out.println("gas 있다");
        return true;
    }



    private static int plus(int x, int y) {
        return x + y;
    }

    private static int sum2(int... values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }

        return sum;
    }
}
