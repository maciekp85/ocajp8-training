package exercise13;

public class RunnerTest {

  public static void displayRunner(Runner r) {
    r.run();
  }
  public static void main(String [] args) {
//    displayRunner( void -> System.out.println("running...") );  // WRONG
    displayRunner( ()-> System.out.println("running...") ); // OK
//    displayRunner( () -> { System.out.println("Running..."); return; } ); // OK
//    displayRunner( () -> { System.out.println("Running..."); } ); // OK
//    displayRunner( -> System.out.println("Running...") ); // WRONG
//    displayRunner( -> System.out.println("Running..."); );  // WRONG
  }
}
