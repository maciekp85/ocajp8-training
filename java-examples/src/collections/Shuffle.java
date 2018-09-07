package collections;

import java.util.*;

public class Shuffle {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    for (String a : args)
      list.add(a);
    Collections.shuffle(list, new Random());
    System.out.println(list);

    List<String> list2 = Arrays.asList(args);
    Collections.shuffle(list2);
    System.out.println(list2);
  }
}
