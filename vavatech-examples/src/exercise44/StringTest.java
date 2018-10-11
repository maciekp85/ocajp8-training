package exercise44;

public class StringTest {
  public static void main(String[] args) {
    String s = null;
    try {
      s.trim();
    } catch (Exception e) {
      System.out.println("exc");
    }
    s.trim();
  }
}

// Result: exc then an exception is thrown
