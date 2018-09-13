package exercise10;

public class Propeller2 {
  public static void main(String[] args) throws Exception {
    new Propeller2().topGo();
  }
  
  void topGo() throws Exception{
    middleGo();
  }

  void middleGo() throws Exception {
    go();
    System.out.println();
  }

  void go() throws Exception {
    throw new Exception(  );
  }
}
