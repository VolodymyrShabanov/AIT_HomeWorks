package home_work_37;

import home_work_30.teacher.MyArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Volodymyr Sh on 29.10.2023
 * project name: AIT_HomeWorks
 */
public class Task2BetweenDates {
    public static long daysBetweenDates(LocalDate[] dates) {
        if (dates == null || dates.length == 0) return Long.MIN_VALUE;

        LocalDate earlierDate = dates[0];
        LocalDate laterDate = dates[0];
        for (LocalDate date : dates) {
            if (date != null && earlierDate.isAfter(date)) {
                earlierDate = date;
            }
            if (date != null && laterDate.isBefore(date)) {
                laterDate = date;
            }
        }

        if (earlierDate == null) {
            return Long.MIN_VALUE;
        }

        return ChronoUnit.DAYS.between(earlierDate, laterDate);
    }


    // Option 1
    public static long daysBetweenDates(MyArrayList<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) return Long.MIN_VALUE;

        LocalDate earlierDate = dates.get(0);
        LocalDate laterDate = dates.get(0);
        for (int i = 0; i < dates.size(); i++) {
            if (dates.get(i) != null && earlierDate.isAfter(dates.get(i))) {
                earlierDate = dates.get(i);
            }
            if (dates.get(i) != null && laterDate.isBefore(dates.get(i))) {
                laterDate = dates.get(i);
            }
        }

        if (earlierDate == null) {
            return Long.MIN_VALUE;
        }

        return ChronoUnit.DAYS.between(earlierDate, laterDate);
    }


//    // Option 2
//    public static long daysBetweenDates(MyArrayList<LocalDate> dates) {
//        if (dates == null || dates.size() == 0) return Long.MIN_VALUE;
//
//        LocalDate[] newDates = new LocalDate[dates.size()];
//
//        for (int i = 0; i < dates.size(); i++) {
//            newDates[i] = dates.get(i);
//        }
//
//        return daysBetweenDates(newDates);
//    }

}
