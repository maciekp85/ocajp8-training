package exercise50;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
  public static void main(String[] args) {
    List p = new ArrayList(  );
    p.add( 7 );
    p.add( 2 );
    p.add( 5 );
    p.add( 2 );
    System.out.println("Before sorted: " + p);
//    p.sort(); // Compilation fails, you must pass comparator as parameter for the sort method
    p.sort( null ); // Elements' natural ordering will be using
    System.out.println("After sorted: " + p);
    System.out.println();
  }
}
