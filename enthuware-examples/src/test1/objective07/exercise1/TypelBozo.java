package test1.objective07.exercise1;

public class TypelBozo implements Bozo {

  public TypelBozo() {
//    type = 1; // Cannot assign a value to final variable "type"
  }

  public void jump() {
    System.out.println("jumping..."+type);
  }

  public static void main(String[] args) {
    Bozo b = new TypelBozo();
    b.jump();
  }
}
