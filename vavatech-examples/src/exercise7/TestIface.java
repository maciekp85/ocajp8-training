package exercise7;

interface MyInterface {
  static long boat = 7L;
  long myMethod(long x);
  public default void myMethod2() {

  }
}
public class TestIface implements MyInterface {
  public static void main(String[] args) {
    new TestIface().myMethod( 6L );
  }

  @Override
  public long myMethod(long x) {  // before adding change there was without public access privileges (there was weaker access privileges package-private)
    System.out.println(((++x * boat)-(--x + 1)));
    return 42L;
  }
}
