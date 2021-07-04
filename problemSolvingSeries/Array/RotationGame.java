import java.util.Scanner;
/*

You are given an integer T (Number of test cases). 
For each test case, you are given an integer array A and an integer B. 
You have to print the same array after rotating it B times towards right.


Input:

 2  -----> # of T.C.

 4 1 2 3 4  ---> 1st value denotes the array length and remaining is the elements
 2
 3 1 2 4
 1



Output:

 3 4 1 2
 4 1 2


*/

public class RotationGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    while (T-- > 0) {
      int N = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < N; i++) {
        A[i] = sc.nextInt();
      }
      int B;
      B = sc.nextInt();
      B = B % N;

      int[] ans = new int[N];
      for (int i = 0; i < N; ++i) {
        ans[i] = A[(i - B + N) % N];
      }

      for (int i = 0; i < N; i++) {
        System.out.print(ans[i] + " ");
      }
      System.out.println();
    }
  }
}
