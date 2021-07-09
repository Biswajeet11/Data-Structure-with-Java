import java.util.Scanner;
/*

Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.


Input:

 A = [   [0, 1, 1]
         [0, 0, 1]
         [0, 1, 1]   ]


Output:

 0

*/

public class RowsWithMaxOnes {
  public int rowsWithMaxOne(int[][] A) {
    int i = 0, count = 0;

    for (int j = A[0].length - 1; j >= 0 && i < A.length;) {
      if (A[i][j] == 1) {
        j--;
        count = i;
      } else {
        i++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    RowsWithMaxOnes pt = new RowsWithMaxOnes();
    System.out.println("Enter the number of rows");
    int m = sc.nextInt();
    System.out.println("Enter the number of Columns");
    int n = sc.nextInt();
    int arr[][] = new int[m][n];
    int k = sc.nextInt();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int output = pt.rowsWithMaxOne(arr);
    System.out.println(output);
  }
}
