package interfaces;

public interface Relatable {
  // this (object calling isLargerThan)
  // and other must be instances of
  // the same class returns 1, 0, -1
  // if this is greater than,
  // equal to, or less than other
  public int isLargerThan(Relatable other);

  String key = "||";

  public static void method(){

  }

  class NestedClass {
    protected int a = 0;
    public int b = 0;

    public static int c = 0;

    public void method1() {

    }

    static private void method2() {

    }
  }

  Relatable rel = new Relatable() {
    @Override
    public int isLargerThan(Relatable other) {
      return 0;
    }
  };

  default void method1() {

  }
}
