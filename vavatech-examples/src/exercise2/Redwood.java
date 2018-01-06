package exercise2;

public class Redwood extends Tree {
  public static void main(String[] args) {
    Tree t1 = new Tree();
    Tree t2 = new Redwood();
    Redwood r1 = new Redwood();
//    Redwood r2 = t2;  // will not compile, incompatible types: required Redwood found Tree
    Redwood r2 = (Redwood) t2;
    Tree t3 = t2;
    Tree t4 = (Tree)t2;
  }
}


class Tree {}