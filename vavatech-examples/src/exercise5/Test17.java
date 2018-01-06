package exercise5;

import java.util.ArrayList;
import java.util.Iterator;

public class Test17 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(  );
    list.add( 2 );
    list.add( 4 );
    list.add( 6 );
    Iterator<Integer> it1 = list.iterator();
    System.out.println(it1.next());
    System.out.println(it1.next());
    Iterator<Integer> it2 = list.iterator();
    System.out.println(it2.next()); // will print value 2
  }
}
