package exercise12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Data {
  int value;

  Data(int value) {
    this.value = value;
  }

  public String toString() {
    return ""+value;
  }

  public void filterData(ArrayList<Data> dataList, Predicate<Data> p) {
    Iterator<Data> i = dataList.iterator();
    while (i.hasNext()) {
      if (p.test( i.next() )) {
        i.remove();
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Data> a1 = new ArrayList<>(  );
    Data d = new Data( 1 ); a1.add( d );
    d = new Data( 2 ); a1.add( d );
    d = new Data( 3 ); a1.add( d );
//    d.filterData( a1, x -> x.value%2 == 0 );  // OK
//    d.filterData( a1, y -> y.value%2 == 0 );  // OK
//    d.filterData( a1, (Data x) -> x.value%2 == 0);  // OK
//    d.filterData( a1, (Data y) -> y.value%2 == 0 ); // OK
//    d.filterData( a1, (Data x) -> x.value%2); // Bad return type in lambda expression
//    d.filterData( a1, d -> d.value%2 == 0 );  // Variable 'd' is already defined in the scope
//    d.filterData( a1, d-> {return d.value%2;} ); // Variable 'd' is already defined in the scope
//    d.filterData( a1, c -> {return c.value%2;} ); // Bad return type in lambda expression
//    d.filterData( a1, c -> { return c.value%2==0;} ); // OK
//    d.filterData( a1, Data e -> e.value%2 == 0);  // WRONG '(Data e)' expected
    System.out.println(a1);
  }
}