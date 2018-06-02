package chap11.sec16.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재시 = " + now);

        LocalDateTime targetDateTime = now
                .plusYears(1)
                .plusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .minusMinutes(5)
                .plusSeconds(6);
        /*targetDateTime = targetDateTime.plusMonths(2);
        targetDateTime = targetDateTime.plusDays(3);
        targetDateTime = targetDateTime.plusHours(4);
        targetDateTime = targetDateTime.minusMinutes(5);
        targetDateTime = targetDateTime.plusSeconds(6   );*/



        System.out.println("연산 후 = " + targetDateTime);


    }
}
