package inheritance.interface_methods3;

public class Mustang extends Horse implements Mammal {
  public static void main(String... args) {
    Mustang myApp = new Mustang();
    System.out.println(myApp.identifyMyself());
  }
}
