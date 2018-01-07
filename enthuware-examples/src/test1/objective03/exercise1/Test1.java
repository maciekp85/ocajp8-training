package test1.objective03.exercise1;

public class Test1 {
  public static void main(String[] args) {
    char c;
    int i;
    c = 'a';
    i = c;
    i++;
    c = (char)i;
//    c = i;  // wrong
    c++;
  }
}
