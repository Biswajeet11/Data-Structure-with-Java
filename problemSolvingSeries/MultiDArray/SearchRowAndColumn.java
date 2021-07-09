import java.util.Scanner;

/*

Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in increasing order.
Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.


*/

public class SearchRowAndColumn {
  public int searchInRowAndColumn(int[][] A, int B) {
    int value = 0;
    int flag = 0;

    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[0].length; j++) {
        if (A[i][j] == B) {
          value = (i + 1) * 1009 + (j + 1);
          flag = 1;
          return value;
        }
      }
    }

    if (flag == 1) {
      return value;
    }

    else {
      return -1;
    }

  }

  public static void main(String[] args) {
    SearchRowAndColumn src = new SearchRowAndColumn();
    Scanner sc = new Scanner(System.in);
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
    int output = src.searchInRowAndColumn(arr, k);
    System.out.println(output);

  }

}
