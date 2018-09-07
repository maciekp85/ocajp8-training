package date_time;

import java.time.Year;

public class YearDemo {
  public static void main(String[] args) {
    boolean validLeapYear = Year.of(2012).isLeap();
  }
}
