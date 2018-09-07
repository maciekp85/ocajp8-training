package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 * Parses the input at the command line. The expected format is
 * MMM d yyyy. In other words, a 3-character representation of
 * the month, the day (one or two digits), and a 4-digit year.
 */
public class Parse {
  public static void main(String[] args) {
    if (args.length < 3)
    {
      System.out.printf("Usage: Parse <3-char month> <day> <4-digit year>%n");
      throw new IllegalArgumentException();
    }
    String input = args[0] + ' ' + args[1] + ' ' + args[2];
    try {
      DateTimeFormatter formatter =
              DateTimeFormatter.ofPattern("MMM d yyyy");
      LocalDate date = LocalDate.parse(input, formatter);
      System.out.printf("%s%n", date);
    } catch (DateTimeParseException exc) {
      System.out.printf("%s is not parsable!%n", input);
      throw exc;       // Rethrow the exception.
    }
    // 'date' has been successfully parsed
  }
}
