package exercise39;

public class Test1 {
  public static void main(String[] args) {
    String s = null;
    switch (s) {  // NullPointerException
//      case null: System.out.println("null");  // The code does not compile but if we comment out line 1 then runtime exception wil be thrown
      case "abc": System.out.println("abc");
      default: System.out.println("default");
    }

    short sh = 10;
    switch (sh) {
      case 1:
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      default:
        System.out.println("Other number");
    }
  }
}
