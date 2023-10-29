package home_work_37;

import home_work_30.teacher.MyArrayList;
import java.time.LocalDate;
import static home_work_37.Task2BetweenDates.daysBetweenDates;

/**
 * Created by Volodymyr Sh on 29.10.2023
 * project name: AIT_HomeWorks
 */

public class Task2MainLocalDate {
    public static void main(String[] args) {
        LocalDate [] dates = null;
        dates = new LocalDate[4];
        dates[0] = LocalDate.of(2022,12,12);
        dates[1] = LocalDate.of(2021, 7, 13);
        dates[2] = LocalDate.of(2023, 3, 17);
        dates[3] = LocalDate.of(2000, 6, 5);

        long result = daysBetweenDates(dates); //daysBetweenDates
        System.out.println(result);

        MyArrayList<LocalDate> datesArrayList = new MyArrayList<>();
        datesArrayList.add(LocalDate.of(2022,12,12));
        datesArrayList.add(LocalDate.of(2021, 7, 13));
        datesArrayList.add(LocalDate.of(2023, 3, 17));
        datesArrayList.add(LocalDate.of(2000, 6,5));


        long result2 = daysBetweenDates(datesArrayList);
        System.out.println(result2);

    }
}
