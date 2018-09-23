package exercise21;

public class StaticAndNotStaticFieldTest {
  int x;
  static int y;

  public static void main(String[] args) {
    StaticAndNotStaticFieldTest a = new StaticAndNotStaticFieldTest();
    StaticAndNotStaticFieldTest b = new StaticAndNotStaticFieldTest();

    a.x = 1;
    b.x = 2;
    a.y = 1;
    b.y = 2;

    System.out.println("a.x = " + a.x);
    System.out.println("b.x = " + b.x);
    System.out.println("a.y = " + a.y);
    System.out.println("b.y = " + b.y);
  }

}
