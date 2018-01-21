package test1.objective05.exercise3;

public class Test3 {
  public static void main(String[] args) {
    String[] sa = {"a", "b", "c"};
    for (String s: sa) {
      if ("b".equals( s )) continue;
      System.out.println(s);
      if ("b".equals( s )) break;
      System.out.println(s + " again");
    }
  }
}
