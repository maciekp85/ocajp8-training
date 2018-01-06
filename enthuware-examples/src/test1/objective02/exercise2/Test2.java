package test1.objective02.exercise2;

public class Test2 {
  public static void main(String[] args) {
//    long y = 123_456_L; // Illegal underscore
//    long z = _123_456L; // Illegal underscore
//    float f1 = 123_.345_667F; // Illegal underscore

    // _123_456L is a valid variable name though. So the following code is valid:
    int _123_456L = 10;
    long z = _123_456L;

    float f2 = 123_345_667F;  // correct
  }
}
