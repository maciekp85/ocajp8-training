package exercise32;

public class ArrayTest {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};

    // A.
//    for (int n: arr) {
//      System.out.println(arr[n]); // for n = 5 ArrayIndexOutOfBoundsException
//    }

    // B.
    for (int n: arr) {
      System.out.println(n);  // Correct
    }

    // C.
//    for (int n=1; n<6; n++) {
//      System.out.println(arr[n]); // for n = 5 ArrayIndexOutOfBoundsException is thrown and no item with index 0
//    }

    // D.
//    for (int n=1; n<=5; n++) {
//      System.out.println(arr[n]); // for n = 5 ArrayIndexOutOfBoundsException is thrown and no item with index 0
//    }
  }
}
