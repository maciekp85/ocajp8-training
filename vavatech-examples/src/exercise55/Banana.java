package exercise55;

public class Banana {

  int x = 1;

  public static void main(String[] args) {
    int x = 2;
    Banana b = new Banana();
    b.go();   // Results: x = 3;
  }

  { x += x;}  // here x will be equal 1 so x = 1 + 1 = 2

  void go() {
    ++x;
    System.out.println(x);
  }
}
