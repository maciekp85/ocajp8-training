package exercise3;

public class A {
  public int getCode() {return 2;}

  public static void main(String[] args) {
    A a = null;
    AA aa = null;

    a = (AA)aa;
    a = new AA();
//    aa = new A(); // will not compile, incompatible types: required AA found A
    aa = (AA)a;
//    aa = a; // will not compile, incompatible types: required AA found A
    ((AA)a).doStuff();

  }
}

class AA extends A {
  public void doStuff() {}
}
