package exercise45;

class FWD {
  int doMud(int x) {return 1;}
}

class Subaru extends FWD {

  int doMud(int... i) { return 2;}
  int doMud(int z) {return 3;}
}

class Race {
  public static void main(String[] args) {
    int s = new Subaru().doMud(7);
    System.out.println(s);  // Result: 3
  }
}
