package chap11.sec16.exam01_java_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {

        LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);

        System.out.println("시작일 = " + startDateTime);

        LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
        System.out.println("종료일 = " + endDateTime + "\n");


        if (startDateTime.isBefore(endDateTime)) {
            System.out.println("진행 중입니다." + "\n");
        } else if (startDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다." + "\n");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("종료했습니다." + "\n");
        }

        System.out.println("[종료까지 남은 시간]");
        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        System.out.println("남은 해: " + remainYear);


        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        System.out.println("남은 달: " + remainMonth);

        long remainDays = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        System.out.println("남은 일: " + remainDays);

        long remainHours= startDateTime.until(endDateTime, ChronoUnit.HOURS);
        System.out.println("남은 시간: " + remainHours);

        long remainMinutes= startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        System.out.println("남은 분: " + remainMinutes);

        long remainSeconds= startDateTime.until(endDateTime, ChronoUnit.SECONDS);
        System.out.println("남은 초: " + remainSeconds + "\n");

        remainYear= ChronoUnit.YEARS.between(startDateTime, endDateTime);
        System.out.println("remainYear = " + remainYear);

        remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
        System.out.println("remainMonth = " + remainMonth);

        remainDays = ChronoUnit.DAYS.between(startDateTime, endDateTime);
        System.out.println("remainDays = " + remainDays + "\n");

        Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
        System.out.print("남은 기간: " + period.getYears() + "년");
        System.out.print(period.getMonths() + "달");
        System.out.println(period.getDays() + "일" + "\n");

        Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
        System.out.println("남은 시간:  " + duration.toHours());
        System.out.println("남은 분: " + duration.toMinutes());
        System.out.println("남은 초: " + duration.getSeconds());
    }
}
