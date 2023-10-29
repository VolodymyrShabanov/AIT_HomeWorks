package home_work_37;

import java.time.LocalDate;
import java.time.LocalTime;

// Created by Volodymyr Sh on 29.10.2023
// project name: AIT_HomeWorks
public class Task1LocaleDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("current date: " + localDate);
        System.out.println("current || year: " + localDate.getYear()
                            + " month (value): " + localDate.getMonthValue()
                            + " (month (word): " + localDate.getMonth() + ") "
                            + " day: " + localDate.getDayOfMonth());

        LocalDate myBirthday = LocalDate.of(1985, 7, 15);
        System.out.println("my birthday: " + myBirthday);

        LocalDate firstDate = LocalDate.of(2012, 1, 28);
        LocalDate secondDate = LocalDate.of(2015, 10, 30);
        System.out.println("equals: " + firstDate.equals(secondDate));

        LocalTime localTime = LocalTime.now();
        System.out.println("current time: " + localTime);
        System.out.println("current time plus 3 hours: " + localTime.plusHours(3));

        LocalDate weekLater = localDate.plusWeeks(1);
        System.out.println("a week later: " + weekLater);

        LocalDate yearEarlier = localDate.minusYears(1);
        System.out.println("a year earlier: " + yearEarlier);

        LocalDate yearLater = localDate.plusYears(1);
        System.out.println("year later: " + yearLater);

        LocalDate tomorrow = localDate.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);

        LocalDate yesterday = localDate.minusDays(1);
        System.out.println("yesterday: " + yesterday);

        System.out.println("tomorrow isAfter: " + tomorrow.isAfter(localDate));
        System.out.println("local Date is Before: " + localDate.isBefore(tomorrow));

        System.out.println("yesterday isBefore: " + yesterday.isBefore(localDate));
        System.out.println("local Date is After: " + localDate.isAfter(yesterday));




    }
}
