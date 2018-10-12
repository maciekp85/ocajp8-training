package exercise48;

class Chemical {
  int ph() {return 7; }
}

public class Acid {
  public static void main(String[] args) {
    new Acid().go();
  }

  void go() {
    System.out.println(ph() + " " + (new String[3]).getClass().getName() + " " + getPh());
//    System.out.println(ph() + " " + super.ph() + " " + getPh());  // Compilation fails, there is no ph() method in superclass (here Object class)
  }

  int getPh() { return 4; }

  int ph() { return 3; }
}
