package exercise54;

public class Test {
  public static void main(String[] args) {
    switch (5) {
      case 0:
        System.out.println("zero");
        break;
      case 5+1:
        System.out.println("one");
      default:
        System.out.println("default");
      case 1:
        System.out.println("two");
    }
  }
}
