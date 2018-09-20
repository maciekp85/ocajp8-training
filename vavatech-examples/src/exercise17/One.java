package exercise17;

public interface One {
  default int value() {return 16;}
}

interface Two {
  default int value() {return 16;}
  default int use() {return 10 * value();}
}

class Test implements One, Two{
  public int value() {return 5;}
  public int test() { return use();}

  public static void main(String args[]) {
    Test t = new Test();
    System.out.println(t.test());
  }
}
