package exercise65;

public class A {
  int i;
  public A(int x) {
    this.i = x;
  }
}

class B extends A {
  int j;
  public B(int x, int y) {
    super(x);
    this.j = y;
  }

//  B(int y) {  // compilation error, there is no default constructor available in A class
//    j = y;
//  }

//  B() { // compilation error, there is no default constructor available in A class
//  }

//  B(int y) {  // correct
//    super(y*2);
//    j = y;
//  }

//  B(int y) { // compilation error, there is no default constructor available in A class
//    i = y; j = y*2;
//  }

  B(int z) {  // correct but without the same constructor with only the one int argument
    this(z, z);
  }
}
