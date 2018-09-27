package exercise34;

import java.util.ArrayList;

public class TestClass {
  public static void main(String[] args) throws Exception {
    ArrayList<Integer> a1 = new ArrayList<>(  );
    a1.add( 111 );
    System.out.println(a1.get( a1.size() ));  // IndexOutOfBoundsException
  }
}
