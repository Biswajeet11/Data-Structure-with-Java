import java.util.Scanner;

/*
Exit Point Of A Matrix

Question
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes 
a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where
you exit the matrix.


*/

public class ExitPointOfAMatrix {

  public static void printExitPoint(int arr[][]) {
    int n = arr.length;
    int m = arr[0].length;
    int i = 0;
    int j = 0;
    int direction = 0;

    while (true) {
      // direction --> east:0, south:1, west:2 ,north:3,

      direction = (direction + arr[i][j]) % 4;
      if (direction == 0) {
        j++;
      } else if (direction == 1) {
        i++;
      } else if (direction == 2) {
        j--;
      } else if (direction == 3) {
        i--;
      }

      if (i < 0) {
        i++;
        break;
      } else if (i == n) {
        i--;
        break;
      } else if (j < 0) {
        j++;
        break;

      } else if (j == m) {
        j--;
        break;
      }

    }
    System.out.println("Row Index " + i);
    System.out.println("Column Index " + j);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int m = sc.nextInt();
    System.out.println("Enter the number of Columns");
    int n = sc.nextInt();
    int arr[][] = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    printExitPoint(arr);
  }

}
