package date_time;

import java.time.Month;
import java.time.MonthDay;

public class MonthDayDemo {
  public static void main(String[] args) {
    MonthDay date = MonthDay.of( Month.FEBRUARY, 29);
    boolean validLeapYear = date.isValidYear(2010);
  }
}
