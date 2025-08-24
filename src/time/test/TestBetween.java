package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;
import java.util.Scanner;

public class TestBetween {
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter stringToDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("시작 날짜: ");
        String startDateString = sc.nextLine();
        LocalDate startDate = LocalDate.parse(startDateString, stringToDateFormatter);

        System.out.print("목표 날짜: ");
        String ofDateString = sc.next();
        LocalDate ofDate = LocalDate.parse(ofDateString, stringToDateFormatter);

        Period between = Period.between(startDate, ofDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, ofDate);
        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "월 " + between.getDays() + "일");
        System.out.println("디데이: " + daysBetween + "일 남음");
*/
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일 ");
        System.out.println("디데이: " + daysBetween + "일 남음");

    }
}
