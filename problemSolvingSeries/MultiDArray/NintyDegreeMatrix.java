import java.util.Scanner;
/*

You are given a n x n 2D matrix A 

Rotate the 2d array by 90 degrees (clockwise).


Input:

 [
    [1, 2],
    [3, 4]
 ]

Output :

[
    [3, 1],
    [4, 2]
 ]



*/

public class NintyDegreeMatrix {

  public int[][] transpose(int[][] A) {
    for (int i = 0; i < A.length; i++) {
      for (int j = i; j < A[0].length; j++) {
        int temp = A[i][j];
        A[i][j] = A[j][i];
        A[j][i] = temp;
      }
    }
    return A;
  }

  public int[][] swapColumns(int[][] A) {
    for (int i = 0; i < A.length; i++) {
      int leftIndex = 0, rightIndex = A[0].length - 1;
      int temp = 0;
      while (leftIndex <= rightIndex) {
        temp = A[i][rightIndex];
        A[i][rightIndex] = A[i][leftIndex];
        A[i][leftIndex] = temp;
        leftIndex++;
        rightIndex--;
      }
    }
    return A;
  }

  public void print(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
    }
  }

  public void solveRotation(int[][] A) {
    transpose(A);
    swapColumns(A);
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

    NintyDegreeMatrix ndm = new NintyDegreeMatrix();
    ndm.solveRotation(arr);
    ndm.print(arr);
  }
}
