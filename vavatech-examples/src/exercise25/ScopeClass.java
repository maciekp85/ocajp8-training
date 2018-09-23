package exercise25;

public class ScopeClass {
  private int i =35;

  public static void main(String argv[]) {
    int i=45;
    ScopeClass s = new ScopeClass();
    s.someMethod();
  }

  public static void someMethod() {
//    System.out.println(i);  // Compile time error will be generated, non static field 'i' cannot be referenced from a static context
  }
}
