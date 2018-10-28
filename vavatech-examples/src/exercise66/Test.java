package exercise66;

public class Test {
  public static void main(String[] args) {
    int c = 0;
    int i = 0;
    do {
      if (i > 5) continue;
      c++;
    } while (i++ + 0*c++ < 10);
    System.out.println(c);  // Result: c = 17
  }
}
