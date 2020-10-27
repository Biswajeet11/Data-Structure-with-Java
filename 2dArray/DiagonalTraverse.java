import java.util.Scanner;

/*

1. You are given a number n, representing the number of rows and columns 
of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
3. You are required to diagonally traverse the upper half 
of the matrix and print the contents.


*/

public class DiagonalTraverse {

  public static void getDiagonalTraverse(int arr[][]) {
    System.out.println("----------");
    for (int a = 0; a < arr.length; a++) {
      for (int i = 0, j = i + a; j < arr.length; j++, i++) {
        System.out.println(arr[i][j] + " ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns");
    int m = sc.nextInt();
    int arr[][] = new int[m][m];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    getDiagonalTraverse(arr);
  }

}
