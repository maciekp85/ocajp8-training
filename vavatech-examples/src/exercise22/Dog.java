package exercise22;

class Dog {}
class BorderCollie extends Dog {}
class Kennel {
  public static void main(String[] args) {
    BorderCollie b = new BorderCollie();
    Dog d = (Dog)b;
  }
}