package exercise52;

public class SuperFoo {

  SuperFoo doStuff(int x) {
    return new SuperFoo();
  }
}

class Foo extends SuperFoo {
//  Foo doStuff(int x) { return new Foo(); }  // Correct
//  Foo doStuff(int x) {return new SuperFoo(); } // Incorrect, incompatible types, required Foo -> found SuperFoo
//  SuperFoo doStuff(int x) {return new Foo();}   // Correct
  SuperFoo doStuff(int y) {return new SuperFoo();}  // Correct
}
