package exercise6;

public class Mutate {
  public static void main(String[] args) {

    // Example with using the StringBuilder class
    StringBuilder s = new StringBuilder("0123456789");
    if (s.length()==10)
      s.insert(   10,"abcdef" );
    s.delete( 3,8 );
    System.out.println(s.indexOf( "c" )); // 01289abcdef, c = 7

    // Example with using the String class
    String s2 = new String("0123456789");
    if (s2.length()==10)
      s2 = s2.concat("abcdef" );
    s2 = s2.substring(0, 3 ) + s2.substring( 8 );
    System.out.println(s2.indexOf( "c" )); // 01289abcdef, c = 7
  }
}