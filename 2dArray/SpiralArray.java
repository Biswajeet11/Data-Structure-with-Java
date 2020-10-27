import java.util.Scanner;

/*

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.

*/

public class SpiralArray {

  public static void getSpiralPattern(int arr[][]) {
    int n = arr.length;
    int m = arr[0].length;
    int totalElements = n * m;
    int minRow = 0;
    int minCol = 0;
    int maxRow = n - 1;
    int maxCol = m - 1;
    int countElements = 0;

    System.out.println("---------");

    while (countElements < totalElements) {

      // down column

      for (int i = minRow; i <= maxRow && countElements < totalElements; i++) {
        System.out.println(arr[i][minCol]);
        countElements++;
      }
      minCol++;

      // right row
      for (int i = minCol; i <= maxCol && countElements < totalElements; i++) {
        System.out.println(arr[maxRow][i]);
        countElements++;
      }
      maxRow--;

      // up column
      for (int i = maxRow; i >= minRow && countElements < totalElements; i--) {
        System.out.println(arr[i][maxCol]);
        countElements++;
      }
      maxCol--;

      // left column
      for (int i = maxCol; i >= minCol && countElements < totalElements; i--) {
        System.out.println(arr[minRow][maxCol]);
        countElements++;
      }
      minRow++;

    }
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
    getSpiralPattern(arr);
  }
}
