package test1.objective02.exercise6;

public class Test6 {
  private static int loop = 15;
  static final int INTERVAL = 10;
  boolean flag;
  static {
    System.out.println("Static");
  }

  static {
    loop =1;
  }

  static {
    loop += INTERVAL;
  }

  static {
//    INTERVAL = 10;  // INTERVAL is final and so it can never be changed after it is given a value.
  }

  {
    flag = true;
    loop = 0;
  }
}
