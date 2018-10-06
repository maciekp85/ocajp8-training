package exercise38;

public class Test1 {
  public static void main(String[] args) {
    int s = 0;
    int[] tab = {3,1,0,2};
    try {
      for (int i: tab) {
        for (int j = 0; j < 4;)
          if (++tab[i] >=4 && j++ >=3)
            s += j;
      }
    } catch (Exception e) {}
    System.out.println(s);  // 12
  }
}