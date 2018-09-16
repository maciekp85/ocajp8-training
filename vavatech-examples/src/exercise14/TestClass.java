package exercise14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestClass {
  public static boolean checkList(List list, Predicate<List> p) {
    return p.test( list );
  }

  public static void main(String[] args) {
//    boolean b = checkList( new ArrayList(  ), a1 -> a1.isEmpty() ); // OK
//    boolean b = checkList( new ArrayList(  ), ArrayList a1 -> a1.isEmpty() ); // WRONG
//    boolean b = checkList( new ArrayList(  ), a1 -> return a1.size() == 0 );  // WRONG
//    boolean b = checkList( new ArrayList(  ), a1 -> a1.add( "hello" ) );  // OK
//    boolean b = checkList( new ArrayList(  ), (ArrayList a1) -> a1.isEmpty() ); // WRONG: Incompatible parameter types in lambda expression: expected List but found ArrayList
    boolean b = checkList( new ArrayList(  ), (List a1) -> a1.isEmpty() );  // OK
    System.out.println(b);
  }
}