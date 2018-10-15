package exercise57;

public class IncrementOperatorTest {
  public static void main(String[] args) {
    int x = 2;
    x = x + ((x++ * x++) * x++);
    System.out.println(x);  // Result 26
    int y = 2;
    y = ((y++ * y++) * y++) + y;
    System.out.println(y);  // Result: 29
  }
}
