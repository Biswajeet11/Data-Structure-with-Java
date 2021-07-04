import java.util.Scanner;
/*

Traverse spiral order

Input:

2

Output:

[ [1, 2], [4, 3] ]


*/

public class SpiralOrderTwo {

  public int[][] generateMatrix(int A) {
    int arr[][] = new int[A][A];
    int minRowIndex = 0, maxRowIndex = arr.length - 1;
    int minColumnIndex = 0, maxColumnIndex = arr[0].length - 1;
    int i = 0, j = 0;
    int count = 1;

    while (count <= A * A) {

      while (count <= A * A && j <= maxColumnIndex) {
        arr[minRowIndex][j] = count;
        count++;
        j++;
      }

      minRowIndex++;
      i = minRowIndex;

      while (count <= A * A && i <= maxRowIndex) {
        arr[i][maxColumnIndex] = count;
        count++;
        i++;
      }

      maxColumnIndex--;
      j = maxColumnIndex;

      while (count <= A * A && j >= minColumnIndex) {
        arr[maxRowIndex][j] = count;
        count++;
        j--;
      }

      maxRowIndex--;
      i = maxRowIndex;

      while (count <= A * A && i >= minRowIndex) {
        arr[i][minColumnIndex] = count;
        count++;
        i--;
      }

      minColumnIndex++;
      j = minColumnIndex;
    }

    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SpiralOrderTwo sp = new SpiralOrderTwo();
    int num = sc.nextInt();
    int arr2[][] = sp.generateMatrix(num);
    int m = arr2.length;
    int n = arr2[0].length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }
  }

}
