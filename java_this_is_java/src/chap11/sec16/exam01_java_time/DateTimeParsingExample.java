package chap11.sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
    public static void main(String[] args) {

        DateTimeFormatter formatter;
        DateTimeFormatter formatter1;

        LocalDate localDate;

        localDate = LocalDate.parse("2024-05-21");
        System.out.println("localDate = " + localDate);

        formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        localDate = LocalDate.parse("2024-05-21", formatter);
        System.out.println("localDate = " + localDate);

        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        localDate = LocalDate.parse("2024/05/21", formatter);
        System.out.println("localDate = " + localDate);

        formatter1 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        localDate = LocalDate.parse("2024.05.21", formatter1);
        System.out.println("localDate = " + localDate);

    }
}
