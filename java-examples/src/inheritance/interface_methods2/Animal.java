package inheritance.interface_methods2;

public interface Animal {
  default public String identifyMyself() {
    return "I am an animal.";
  }
}
