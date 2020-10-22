import java.util.Scanner;

/*
Question
1. You are given a number n1, representing the number of rows of 1st matrix.
2. You are given a number m1, representing the number of columns of 1st matrix.
3. You are given n1*m1 numbers, representing elements of 2d array a1.
4. You are given a number n2, representing the number of rows of 2nd matrix.
5. You are given a number m2, representing the number of columns of 2nd matrix.
6. You are given n2*m2 numbers, representing elements of 2d array a2.
7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
8. If the two arrays can't be multiplied, print "Invalid input".



Sample Input
2
3
10
0
0
0
20
0
3
4
1
0
1
0
0
1
1
2
1
1
0
0

Sample Output
10 0 10 0
0 20 20 40



*/

public class MatrixMultiplication {

  public static int[][] getMultipliedMatrix(int arr1[][], int arr2[][], int m, int n) {
    int output[][] = new int[m][n];

    for (int i = 0; i < output.length; i++) {

      for (int j = 0; j < output[0].length; j++) {
        int sum = 0;
        for (int k = 0; k < m; k++) {
          sum += arr1[i][k] * arr2[k][j];
        }
        output[i][j] = sum;

      }
    }
    return output;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows for 1st Matrix");
    int m1 = sc.nextInt();
    System.out.println("Enter the number of Columns for 1st Matrix");
    int n1 = sc.nextInt();
    int arr1[][] = new int[m1][n1];
    for (int i = 0; i < m1; i++) {
      for (int j = 0; j < n1; j++) {
        arr1[i][j] = sc.nextInt();
      }
    }

    System.out.println("Enter the number of rows for 2nd Matrix");
    int m2 = sc.nextInt();
    System.out.println("Enter the number of Columns for 2nd Matrix");
    int n2 = sc.nextInt();
    int arr2[][] = new int[m2][n2];
    for (int i = 0; i < m2; i++) {
      for (int j = 0; j < n2; j++) {
        arr2[i][j] = sc.nextInt();
      }
    }
    int output[][] = getMultipliedMatrix(arr1, arr2, m1, n2);
    for (int i = 0; i < output.length; i++) {
      for (int j = 0; j < output[0].length; j++) {
        System.out.print(output[i][j]+" ");
      }
      System.out.println();
    }
  }
}
