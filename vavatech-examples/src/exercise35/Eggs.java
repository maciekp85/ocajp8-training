package exercise35;

public class Eggs {
  public static void main(String[] args) {
    int[][] basket1 = new int[2][];
    basket1[0] = new int[3];
//    basket1[1] = {1,2,3}; // Compilation failure, array initializer is not allowed here

    int[][] basket2 = new int[2][];
    basket2[0] = new int[]{1,2,3};
    basket2[0][1] = 7;

    System.out.println(basket1[0][1] + " " + basket2[0][1]);
  }
}
