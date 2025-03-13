package api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2025-03-13T14:37:29.123590700

        LocalDate date = LocalDate.now();
        System.out.println(date); // 2025-03-13

        LocalTime time = LocalTime.now();
        System.out.println(time); // 14:39:13.425379300

        // get, set 메서드들이 있다.
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());

        System.out.println();

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        // 증감
        System.out.println(date.plusDays(5)); // 2025-03-18
        System.out.println(time.plusHours(5));

        System.out.println(date.minusYears(1987));

    }
}
