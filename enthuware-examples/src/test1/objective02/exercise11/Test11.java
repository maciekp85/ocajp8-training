package test1.objective02.exercise11;

public class Test11 {

  private Object o;
  void doSomething(Object s){  o = s;   }

  public static void main(String[] args) {
    Object obj = new Object(); // 1
    Test11 tc = new Test11(); //2
    tc.doSomething(obj); //3
    obj = new Object();    //4
    obj = null;    //5
    tc.doSomething(obj); //6  Before this line the object (Object) is being pointed to by at least one variable.
  }
}
