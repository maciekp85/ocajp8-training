package exercise49;

class HorseRadish {
  // insert code here
// protected HorseRadish() {this(42);} // 1st way

  protected HorseRadish() {new HorseRadish( 42 );}  // 2nd way
  protected HorseRadish(int x) {
    System.out.println("bok choy");
  }
}

public class Wasabi extends HorseRadish {
  public static void main(String[] args) {
    Wasabi w = new Wasabi();
  }
}
