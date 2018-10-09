package exercise40;

public class Variables {
  static int x = 5;

  public static void main(String[] args) {
//    int x = x * 4;    // Compilation fails, variable 'x' might not have been initialized
    System.out.println(x);
  }
}

