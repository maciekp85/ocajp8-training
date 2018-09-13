package exercise11;

import java.util.ArrayList;

@FunctionalInterface
interface Process {
  public abstract void process(int a, int b);
}

public class Data {
  int value;
  Data(int value) {
    this.value = value;
  }

  public static void processList(ArrayList<Data> dataList, Process p) {
    for (Data d: dataList) {
      p.process( d.value, d.value );
    }
  }

  public static void main(String[] args) {
    ArrayList<Data> a1 = new ArrayList<>(  );
    a1.add( new Data( 1 ) );
    a1.add( new Data( 2 ) );
    a1.add( new Data( 3 ) );
    processList( a1, (a, b) -> System.out.println(a*b) ); // OK
    processList( a1, (int a, int b) -> System.out.println(a*b) ); // OK
    processList( a1, (a,b) -> { System.out.println(a*b); } ); // OK
//    processList( a1, a,b -> System.out.println(a*b) );  // No curly brackets
//    processList( a1, (a, b) -> System.out.println(a*b); );  // Unnecessary semicolon after ending curly brackets for println method
  }
}
