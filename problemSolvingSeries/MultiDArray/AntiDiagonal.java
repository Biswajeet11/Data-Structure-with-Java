import java.util.Scanner;
/*

Input:     

1 2 3
4 5 6
7 8 9

Return the following :

[ 
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]


*/

public class AntiDiagonal {

  public int[] getDiagonal(int r, int c, int n, int arr[][]) {
    int size = c - r + 1;
    int newArr[] = new int[size];
    int k = 0;
    while (r < n && c >= 0) {
      newArr[k] = arr[r][c];
      r++;
      c--;
      k++;
    }
    return newArr;
  }

  public int[][] diagonal(int[][] A) {
    int rows = 2 * A.length - 1;
    int arr[][] = new int[rows][];
    int n = A.length;

    for (int c = 0; c < n; c++) {
      arr[c] = getDiagonal(0, c, n, A);
    }

    for (int r = 1; r < n; r++) {
      arr[n + r - 1] = getDiagonal(r, n - 1, n, A);
    }

    return arr;

  }

  public static void main(String[] args) {
    AntiDiagonal ad = new AntiDiagonal();
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
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    ad.diagonal(arr);
  }

}
