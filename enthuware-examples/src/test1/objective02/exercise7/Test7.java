package test1.objective02.exercise7;

public class Test7 {
  public static void main(String[] args) {
    Object o = new java.io.File( "a.txt" );
    Boolean bool = false;
    char ch = 10;
//    Thread t = new Runnable();  Since Runnable is an interface, it cannot be instantiated like this.
    Runnable t = new Runnable() {
      @Override
      public void run() {}
    };
    
    Runnable r = new Thread(  );
  }
}
