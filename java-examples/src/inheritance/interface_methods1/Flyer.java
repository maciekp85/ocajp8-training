package inheritance.interface_methods1;

public interface Flyer {
  default public String identifyMyself() {
    return "I am able to fly.";
  }
}
