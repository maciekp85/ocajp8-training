package exercise8;

//import exercise8.x.X;

//import static exercise8.x.X.doX;

public class Find {
  public static void main(String args[]) {
//    doX();  // will not compile, not have: import static exercise8.x.X.doX;
//    X.doX(); // will not compile, not have: import exercise8.x.X;
    exercise8.x.X.doX();    // first possibility

    // Second possibility
    exercise8.x.X myX = new exercise8.x.X();
    myX.doX();
  }
}
