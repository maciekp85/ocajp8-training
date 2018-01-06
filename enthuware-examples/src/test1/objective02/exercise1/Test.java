package test1.objective02.exercise1;

public class Test {

  public static void main(String[] args) {
    String mstr = "123";
    long m = new Long( mstr );
    long m1 = Long.parseLong( mstr );
    long m2 = Long.valueOf( mstr );
  }
}
