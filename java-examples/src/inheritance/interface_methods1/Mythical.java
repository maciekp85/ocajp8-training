package inheritance.interface_methods1;

public interface Mythical {
  default public String identifyMyself() {
    return "I am a mythical creature.";
  }
}
