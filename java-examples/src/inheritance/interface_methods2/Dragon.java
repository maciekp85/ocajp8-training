package inheritance.interface_methods2;

public class Dragon implements EggLayer, FireBreather {
  public static void main(String... args) {
    Dragon myApp = new Dragon();
    System.out.println( myApp.identifyMyself() );
  }

  @Override
  public String identifyMyself() {
    EggLayer.super.identifyMyself();
    return FireBreather.super.identifyMyself();
  }
}