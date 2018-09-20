package exercise16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
  public static void main(String[] args) {
    LocalDate d0 = LocalDate.parse( "2015-02-05+01:00", DateTimeFormatter.ISO_OFFSET_DATE );
    LocalDate d1 = LocalDate.parse( "2015-02-05", DateTimeFormatter.ISO_DATE );
    LocalDate d2 = LocalDate.of( 2015,2,5 );
    LocalDate d3 = LocalDate.now();
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
  }
}
