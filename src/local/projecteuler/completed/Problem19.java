package local.projecteuler.completed;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by johng on 6/4/2016.
 */
public class Problem19 {
    public Problem19() {
        LocalDate localDate = LocalDate.ofYearDay(1901, 1);
        int numberOfSundays = 0;

        for(int i = 0; i <= 99; i++) {
            LocalDate year = localDate.plusYears(i);

            for (int k = 0; k < 12; k++) {
                LocalDate c = year.plusMonths(k);

                if (c.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek() == DayOfWeek.SUNDAY)
                    numberOfSundays++;
            }
        }

        System.out.println("Number of First Sundays in 1901: " + numberOfSundays);
    }
}
