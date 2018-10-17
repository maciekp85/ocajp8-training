package exercise60;

public class CopyArray {
  public static void main(String[] args) {
    int[] x = {1,2,3};
    int[] y1 = x; // Correct
    int[] y2; y2=x; // Correct
//    int[] y3 = x.copy();  // Wrong. Cannot resolve method copy()
//    int[] y4; for (int z: x) {y4[z] = x[z];}  // Wrong. Variable y4 might not have been initialized
//    for(int z: x) {x[z] = z;} // Will compile but throw ArrayIndexOutOfBoundsException at runtime
  }
}
