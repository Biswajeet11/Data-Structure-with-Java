import java.util.Scanner;
/*


Question
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a. The numbers can be 1 or 0 only.
4. You are standing in the top-left corner and have to reach the bottom-right corner. 
Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd' (1-step down) 'r' (1-step right).
You can only move to cells which have 0 value in them. You can't move out of the boundaries or in the 
cells which have value 1 in them (1 means obstacle)
5. Complete the body of floodfill function - without changing signature - to print all paths
that can be used to move from top-left to bottom-right.

Note1 -> Please check the sample input and output for details
Note2 -> If all four moves are available make moves in the order 't', 'l', 'd' and 'r'
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
trrrdlt
tlldrt
.. and so on
Constraints
1 <= n <= 10
1 <= m <= 10
e1, e2, .. n * m elements belongs to set (0, 1)
Sample Input
8
8
0 1 0 0 0 0 0 0
0 1 0 1 1 1 1 0
0 1 0 1 0 0 0 0
0 1 0 1 0 1 1 1
0 0 0 0 0 0 0 0
0 1 0 1 1 1 1 0
0 1 0 1 1 1 1 0
0 1 0 0 0 0 0 0
Sample Output
ddddrrttttrrrrrddlllddrrrddd
ddddrrdddrrrrr
ddddrrrrrrrddd



*/

public class FloodFill {

  public static void printTraversedPattern(int arr[][], int row, int col, String path, boolean[][] visited) {

    int m = arr.length - 1;
    int n = arr[0].length - 1;

    if (row < 0 || col < 0 || row > m || col > n || arr[row][col] == 1 || visited[row][col] == true) {
      return;
    } else if (row == m && col == n) {
      System.out.println(path);
      return;
    }
    visited[row][col] = true;

    // top
    printTraversedPattern(arr, row - 1, col, path + "t", visited);

    // left
    printTraversedPattern(arr, row, col - 1, path + "l", visited);

    // down
    printTraversedPattern(arr, row + 1, col, path + "d", visited);

    // right
    printTraversedPattern(arr, row, col + 1, path + "r", visited);

    visited[row][col] = false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows for  Matrix");
    int m = sc.nextInt();
    System.out.println("Enter the number of Columns for  Matrix");
    int n = sc.nextInt();
    int arr[][] = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    printTraversedPattern(arr, 0, 0, "", new boolean[m][n]);
  }
}
