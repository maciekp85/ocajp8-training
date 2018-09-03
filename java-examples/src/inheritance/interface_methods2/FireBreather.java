package inheritance.interface_methods2;

public interface FireBreather extends Animal {
  default public String identifyMyself() {
    return "I am able to fire breather.";
  }
}
