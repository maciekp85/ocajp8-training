package exercise24;

public class TestClass {
  public static void main(String[] args) {
//    int 1rstArg = Integer.parseInt( args[1] );  // Compilation fails, wrong variable name, it can not start with digit
//    System.out.println(args[1rstArg]);

    int rstArg = Integer.parseInt( args[1] );
    System.out.println(rstArg);
  }
}
