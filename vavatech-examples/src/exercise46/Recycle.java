package exercise46;

class Bottle { }

public class Recycle {
  public static void main(String[] args) {
    Bottle b1 = new Bottle();
    Bottle b2 = b1;
    b1 = new Bottle();  // Only the second Bottle object created is eligible for GC
    Bottle b3 = b2;
    b2 = null;
    b1 = b3;
    // do stuff
  }
}

