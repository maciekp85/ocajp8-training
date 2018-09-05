package exceptions;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

  private List<Integer> list;
  private static final int SIZE = 10;

  public ListOfNumbers () {
    list = new ArrayList<Integer>(SIZE);
    for (int i = 0; i < SIZE; i++) {
      list.add(new Integer(i));
    }
  }

  public void writeList() {
    PrintWriter out;
    try {
      // The FileWriter constructor throws IOException, which must be caught.
      out = new PrintWriter( new FileWriter( "OutFile.txt" ) );

      for (int i = 0; i < SIZE; i++) {
        // The get(int) method throws IndexOutOfBoundsException, which must be caught.
        out.println( "Value at: " + i + " = " + list.get( i ) );
      }
      out.close();
    } catch (IndexOutOfBoundsException e) {
      System.err.println( "IndexOutOfBoundsException: " + e.getMessage() );
    } catch (IOException e) {
      System.err.println( "Caught IOException: " + e.getMessage() );
    }
  }
}
