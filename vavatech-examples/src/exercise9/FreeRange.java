package exercise9;

public class FreeRange {
  public static void main(String[] args) {
    int x=7, y=8;
    if (x<y)
      if (x+2 > y)
        if (y < x){}
        else if (!false)
          System.out.println("inner ");   // "inner" string will display
      else if (true)
        System.out.println();
  }
}
