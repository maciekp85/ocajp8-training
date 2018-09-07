package date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateDemo {
  public static void main(String[] args) {

    DayOfWeek dotw = LocalDate.of(2012, Month.JULY, 9).getDayOfWeek();

    LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
    TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
    LocalDate nextWed = date.with(adj);
    System.out.printf("For the date of %s, the next Wednesday is %s.%n",
            date, nextWed);
  }
}
