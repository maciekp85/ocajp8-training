package exercise26;

class Over {
  int doIt(long x) {
    return 3;
  }
}

class Under extends Over {
  short doIt(int x) {
    return 4;
  }

  int doIt(long x, long y) {
    return 4;
  }

  private int doIt(short y) {
    return 4;
  }

  protected int doIt(long x) {
    return 4;
  }

  public static void main(String[] args) {
    Over o = new Over();
    o.doIt( 10 );

    o = new Under();
    o.doIt( 10 );
  }
}
