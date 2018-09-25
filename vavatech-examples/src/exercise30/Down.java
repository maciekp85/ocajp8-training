package exercise30;

class Up {
  public String type = "f ";

  public Up() {
    System.out.print("up ");
  }
}

public class Down extends Up {
  public Down() {
    System.out.print("down ");
  }

  public static void main(String[] args) {
    new Down().go();  // result: up down c c 
  }

  void go() {
    type = "c ";
    System.out.print(this.type + super.type);
  }
}
