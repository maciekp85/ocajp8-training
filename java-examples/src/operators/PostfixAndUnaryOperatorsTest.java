package operators;

public class PostfixAndUnaryOperatorsTest {
  public static void main(String[] args) {
    int i = 1, j = 1;

    if (i++ + ++j == 3) {
      System.out.println("YES: i = " + i + " j = " + j);
    } else {
      System.out.println("NO: i = " + i + " j = " + j);
    }
  }
}
