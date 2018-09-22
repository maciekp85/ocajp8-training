package exercise20;

public interface Word {
  public abstract boolean isSpelled(String w);
}

abstract class Verb1 implements Word {
//  boolean isSpelled() {}  // Missing return statement
}

abstract class Verb2 implements Word {
  boolean isSpelled() {return true;}  // OK
}

abstract class Verb3 implements Word {
//  boolean isSpelled(String w) {return true;}  // attempting to assign weaker access privileges, below correct form
  public boolean isSpelled(String w) {return true;}
}