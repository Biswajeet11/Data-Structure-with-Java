import java.util.Scanner;

/*

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a wave
 - down the first column then up the second column and so on.


Sample Input

3
4
11
12
13
14
21
22
23
24
31
32
33
34

Sample Output
11
21
31
32
22
12
13
23
33
34
24
14



*/

public class WaveTraversal {

  public static void getTraversal(int arr[][]) {
    System.out.println("----------");
    for (int j = 0; j < arr[0].length; j++) {
      if (j % 2 == 0) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i][j] + " ");
        }
      } else {
        for (int i = arr.length - 1; i >= 0; i--) {
          System.out.print(arr[i][j] + " ");
        }
      }
      System.out.println();
    }
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
    getTraversal(arr);
  }
}
