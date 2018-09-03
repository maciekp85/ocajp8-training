package inheritance.interface_methods2;

public interface EggLayer extends Animal {
  default public String identifyMyself() {
    return "I am able to lay eggs.";
  }
}
