package test1.objective02.exercise10;

public class Test10 {
  public static void main(String[] args) {
//    boolean b = null; // wrong
//    boolean b = 1;  // wrong
    boolean b = true | false;
//    bool b = (10<11); // wrong
    boolean b1 = true || false;

    String s = null;
    if(s != null && s.isEmpty()) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
