package home_work_37.teacher;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * Created by Volodymyr Sh on 30.10.2023
 * project name: AIT_HomeWorks
 */
public class DateUtil {

    public static long durationBetweenMinMaxDate(LocalDate[] dates) {
        if (dates == null || dates.length == 0) return 0;

        LocalDate minDate = dates[0];
        LocalDate maxDate = dates[0];

        for (LocalDate date : dates) {
            if (date.isBefore(minDate)) {
                minDate = date;
            }

            if (date.isAfter(maxDate));
            maxDate = date;
        }

        return minDate.until(maxDate, ChronoUnit.DAYS);

    }
}
