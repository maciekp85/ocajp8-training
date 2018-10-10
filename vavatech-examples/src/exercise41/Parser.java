package exercise41;

public class Parser extends Utils {
  public static void main(String[] args) {
    try {
      System.out.println(new Parser().getInt("42"));
    } catch (Exception e) {
      System.err.println("Exc: " + e);
    }
  }

  @Override
  int getInt(String arg) /*throws Exception*/ {   // The method from Parser class clashes with getInt() method from Utils class, overridden method does not throw Exception
    return Integer.parseInt( arg );
  }
}

class Utils {
  int getInt(String arg) {return 42;}
}
