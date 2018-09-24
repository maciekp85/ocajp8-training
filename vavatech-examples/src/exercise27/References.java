package exercise27;

class IntegerMacka {
  public int value;

  IntegerMacka(int value) {
    this.value = value;
  }
}

public class References {
  public void testRefs(String str, StringBuilder sb) {
    str = str + sb.toString();
    sb.append( str );
    str = null;
    sb = null;
  }

  private StringBuilder testRefs2(String str1, StringBuilder sb1) {
    str1 = str1 + sb1.toString();
    sb1.append( str1 );
    str1 = null;
    sb1 = null;
    return sb1;
  }

  public void testRefsInt(int i, IntegerMacka integerMacka) {
    i = i + integerMacka.value;
    integerMacka.value = 0;
    integerMacka = null;
  }

  public Integer testRefsInteger(int j, Integer integer) {
    j = j + integer.intValue();
    integer = 0;
    return integer;
  }

  public static void main(String[] args) {
    String s = "aaa";
    StringBuilder sb = new StringBuilder( "bbb" );
    new References().testRefs( s, sb );
    System.out.println("s="+s+" sb="+sb);

    String str1 = "aaa";
    StringBuilder sb1 = new StringBuilder( "bbb" );
    sb1 = new References().testRefs2( str1, sb1 );
    System.out.println("str1="+str1+" sb1="+sb1);

    int i = 1;
    IntegerMacka integerMacka = new IntegerMacka( 2 );
    new References().testRefsInt( i, integerMacka );
    System.out.println("i="+i+" integerMacka="+integerMacka.value);

    int j = 1;
    Integer integer = new Integer( 2 );
    integer = new References().testRefsInteger( j, integer );
    System.out.println("i="+i+" integer="+integer);
  }


}
