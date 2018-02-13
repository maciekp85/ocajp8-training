package test1.objective06.exercise2;

import java.util.Stack;

public class Test2 {

  public static void main(String[] args) {
    Stack s1 = new Stack();
    Stack s2 = new Stack();
    processStacks(s1, s2);
    System.out.println(s1 + " " + s2);
  }

  private static void processStacks(Stack x1, Stack x2) {
    x1.push( new Integer( "100" ) );
    x2 = x1;
  }
}
