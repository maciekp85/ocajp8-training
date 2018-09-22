package exercise18;

public class Scopes {
  private String a = "A";
  static String b = "B";

  private void run() {
    String s = "S";
    s += s.concat( a ).concat( b ); // s = s + s.concat(a).concat(b)
    {
      String a = "1", b = "2"; s += a; s +=b; b = "X";
    }
    s += a;
    s.concat( b );  // String is an immutable class so without assignment string value will not change
    System.out.print(s);
  }

  public static void main(String... args) {
    new Scopes().run();
    System.out.println(b);
  }
}
