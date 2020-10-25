import java.util.Scanner;

/*

1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a. 
Note - Each row and column is sorted in increasing order.
3. You are given a number x.
4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
5. In case element is not found, print "Not Found".


Output Format
row
col of the location where element is found or "Not Found" if element is not in the matrix
Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
All rows and columns are sorted in increasing order
Sample Input
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
41
42
43
44
43
Sample Output
3
2
*/

public class SearchIn2dMatrix {

  public static void getIndex(int arr[][], int x) {
    int i = 0;
    int j = arr[0].length - 1;
    while (i < arr.length && j >= 0) {
      if (arr[i][j] == x) {
        System.out.println("i:" + i);
        System.out.println("j:" + j);
      } else if (x > arr[i][j]) {
        i++;
      } else {
        j--;
      }
    }
    System.out.println("Not Found");
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
  }
}
