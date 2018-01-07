package test1.objective02.exercise8;

public class Test8 {
  public static void main(String[] args) {
    byte b = -128;
    int i = b;
    b = (byte)i;
    System.out.println(i+" "+b);
  }
}
