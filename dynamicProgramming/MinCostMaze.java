import java.util.Scanner;

/*


Question
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a, which represents a maze.
4. You are standing in top-left cell and are required to move to bottom-right cell.
5. You are allowed to move 1 cell right (h move) or 1 cell down (v move) in 1 motion.
6. Each cell has a value that will have to be paid to enter that cell (even for the top-left and bottom- 
     right cell).
7. You are required to traverse through the matrix and print the cost of path which is least costly.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
The cost of least costly path.
Constraints
1 <= n <= 10^2
1 <= m <= 10^2
0 <= e1, e2, .. n * m elements <= 1000
Sample Input
6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1
Sample Output
23




*/

public class MinCostMaze {

  public static int getMinCostM(int arr[][], int i, int j, int storage[][]) {
    int m = arr.length;
    int n = arr[0].length;

    if (i == m - 1 && j == n - 1) {
      return arr[i][j];
    }

    if (i > m - 1 || j > n - 1) {
      return Integer.MAX_VALUE;
    }

    if (storage[i][j] != -1) {
      return storage[i][j];
    }

    int pathH = getMinCostM(arr, i, j + 1, storage);
    int pathV = getMinCostM(arr, i + 1, j, storage);
    int pathD = getMinCostM(arr, i + 1, j + 1, storage);

    storage[i][j] = arr[i][j] + Math.min(Math.min(pathH, pathV), pathD);

    return storage[i][j];
  }

  public static int getMinCostM(int arr[][]) {
    int m = arr.length;
    int n = arr[0].length;

    int storage[][] = new int[m][n];

    for (int i = 0; i < storage.length; i++) {
      for (int j = 0; j < storage[0].length; j++) {
        storage[i][j] = -1;
      }
    }

    return getMinCostM(arr, 0, 0, storage);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows for 1st Matrix");
    int m = sc.nextInt();
    System.out.println("Enter the number of Columns for 1st Matrix");
    int n = sc.nextInt();
    int arr[][] = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int minCost = getMinCostM(arr);
    System.out.println("mincost" + minCost);
  }
}
