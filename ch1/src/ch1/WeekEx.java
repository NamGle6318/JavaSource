package ch1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekEx {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // 오늘 날짜
        System.out.println(now); // 2025-03-11
        DayOfWeek dayOfWeek = now.getDayOfWeek();

        System.out.println(dayOfWeek.getValue()); // 요일에대한 특정 숫자를 반환해줌. (TUESDAY = 2)
        // Week.MONDAY
        Week today = null;

        switch (dayOfWeek.getValue()) { // Week enum 클래스의 상수를 today에 대입
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WEDNESDAY;
                break;
            case 4:
                today = Week.THURSDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;
            default:
                break;
        }
        System.out.println(today);
        if (today == Week.SUNDAY) {
            System.out.println("게임을 합니다.");
        } else {
            System.out.println("다른걸 합니다.");
        }
    }
}
