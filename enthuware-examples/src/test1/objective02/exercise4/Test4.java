package test1.objective02.exercise4;

public class Test4 {

  public static void testInts(Integer obj, int var) {
    obj = var++;
    obj++;
  }

  public static void main(String[] args) {
    Integer val1 = new Integer( 5 );
    int val2 = 9;
    testInts( val1++, ++val2 );
    System.out.println(val1+" "+val2);
  }
}
