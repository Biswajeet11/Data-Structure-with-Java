import java.util.Scanner;
/*


Given an integer matrix of size m*n, 
you need to find out the value of minimum cost to reach from the cell (0, 0) to (m-1, n-1).
From a cell (i, j), you can move in three directions : (i+1, j), (i, j+1) and (i+1, j+1).
Cost of a path is defined as the sum of values of each cell through which path passes.

Input Format :
Line 1 : Two integers, m and n
Next m lines : n integers of each row (separated by space)

Output Format :
Minimum cost
Constraints :
1 <= m, n <= 20


Sample Input 1 :
3 4
3 4 1 2
2 1 8 9
4 7 8 1
Sample Output 1 :
13



*/

public class MinPathTraversal {

  public static int getMinimumCostOfPath(int arr[][], int i, int j) {
    int m = arr.length - 1;
    int n = arr[0].length - 1;

    if (i > m || j > n) {
      return Integer.MAX_VALUE;
    }
    if (i == m && j == n) {
      return arr[i][j];
    }

    int pathH = getMinimumCostOfPath(arr, i, j + 1);
    int pathV = getMinimumCostOfPath(arr, i + 1, j);
    int pathD = getMinimumCostOfPath(arr, i + 1, j + 1);

    int minPath = arr[i][j] + Math.min(Math.min(pathH, pathV), pathD);

    return minPath;
  }

  public static int getMinimumCostOfPath(int arr[][]) {
    return getMinimumCostOfPath(arr, 0, 0);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int m = sc.nextInt();
    System.out.println("Enter number of columns");
    int n = sc.nextInt();

    int arr[][] = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int minPath = getMinimumCostOfPath(arr);
    System.out.println(minPath);

  }
}
