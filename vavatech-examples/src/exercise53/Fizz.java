package exercise53;

class YaYa {Yum yum;}

interface Yum {void yip();}

public class Fizz extends YaYa implements Yum {
  public void yip() { }
}

interface Zoom extends Yum {}

// Results:
// Class Fizz is-a Yum
// Class Fizz has-a Yum