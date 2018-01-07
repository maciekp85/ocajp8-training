package test1.objective03.exercise2;

public class Test2 {

  public void switchString(String input) {
    switch (input) {
      case "a": System.out.println("apple");
      case "b": System.out.println("bat"); break;
      case "B": System.out.println("big bat");
      default: System.out.println("none");
    }
  }

  public static void main(String[] args) {
    Test2 t = new Test2();
    t.switchString( "B" );
  }
}
