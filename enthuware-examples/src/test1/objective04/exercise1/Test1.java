package test1.objective4.exercise1;

public class Test1 {

  int[][] matrix = new int[2][3];

  int a[] = {1, 2, 3};
  int b[] = {4, 5, 6};

  public int compute(int x, int y) {
    return a[x] * b[y];
  }

  public void loadMatrix() {
    for (int x = 0; x < matrix.length; x++) {
      for (int y = 0; y < matrix[x].length; y++) {
        matrix[x][y] = compute( x, y );
      }
    }
  }
}
