package exercise61;

public class Tiger {
  public static void main(String[] args) {
    short stop = 7;
    String s = "3";
    System.out.print(s + stop + " ");
    System.out.print(stop + s + " ");
    System.out.print(stop + 1 + s);
    // Result: 37 73 83
  }
}
