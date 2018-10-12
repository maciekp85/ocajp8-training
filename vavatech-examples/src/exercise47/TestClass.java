package exercise47;

public class TestClass {
  public static void main(String[] args) {
    try {
      doTest();
    } catch (MyException me) {
      System.out.println(me);
    }
  }

  static void doTest() throws MyException {
    int[] array = new int[10];
    array[10] = 1000;
    doAnotherTest();
  }

  static void doAnotherTest() throws MyException {
    throw new MyException();
  }
}

class MyException extends Exception { }
