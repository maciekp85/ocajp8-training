package exercise63;

public class x {
  public static void main(String[] args) {
    // args[] = {-Dx=y x x y z}
    // we need to add -Dx=y to jvm args to have the system property
    String p = System.getProperty( "x" );
    System.out.println("system property p = " + p);
    if (p.equals( args[0] ))  // not found because p = y but args[0] = -Dx=y
      System.out.println("found at index with number 0: " + " args[0] =" + args[0]);

    if (p.equals( args[1] ))  // not found because p = y but args[1] = x
      System.out.println("found at index with number 1: " + " args[1] =" + args[1]);

    if (p.equals( args[2] )) // not found because p = y but args[2] = x
      System.out.println("found at index with number 2: " + " args[2] =" + args[2]);

    if (p.equals( args[3] )) // found because p = y and args[3] = y
      System.out.println("found at index with number 3: " + " args[3] =" + args[3]);

    if (p.equals( args[4] )) // not found because p = y and args[4] = z
      System.out.println("found at index with number 4: " + " args[3] =" + args[3]);
  }
}
