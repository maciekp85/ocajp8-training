package test;

public class BranchingTest {
  private static int numbers;
  public static void main(String[] args) {

    int id = 0;
    id = numbers++;
    String searchMe = "Look for a substring in me";
    String substring = "sub";
    boolean foundIt = false;

    int max = searchMe.length() -
            substring.length();

    test:
    for (int i = 0; i <= max; i++) {
      int n = substring.length();
      int j = i;
      int k = 0;
      while (n-- != 0) {
        if (searchMe.charAt(j++) != substring.charAt(k++)) {
          continue;
        }
      }
      foundIt = true;
      break;
    }
    System.out.println(foundIt ? "Found it" : "Didn't find it");
  }
}
