import java.util.Scanner;
/*

Question
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to display the contents of 2d array as suggested by output format below.


Sample Input
2
4
11
12
13
14
21
22
23
24

Sample Output
11 12 13 14
21 22 23 24



*/

public class A2dArray {

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
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
