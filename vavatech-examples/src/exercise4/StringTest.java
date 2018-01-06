package exercise4;

public class StringTest {

  public static void main(String[] args) {
    String s = new String("test");
    switch (s) {
      case "Test":
        System.out.println("Test");
        break;
      case "te*":
        System.out.println("te*");
        break;
      case "test":
        System.out.println("test"); // correct answer
        break;
      default:
        System.out.println("default");
    }
  }
}
