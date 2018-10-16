package exercise59;

class A {
  private int i;
  A(int i) { this.i = i;}
}

//class B {}  // 1. Correct, there can be two classes with package-private (no explicit modifier)

//class B extends A {}  // Wrong. There is no default constructor in A class

//class B extends A { B() { System.out.println("i= " + i); }} // Wrong. There is no default constructor in A class

//class B { B(int i) {super(i);}} // Object() in Object cannot be applied to (int)

class B {B(char c) {new A( c ); }}  // 2. Correct