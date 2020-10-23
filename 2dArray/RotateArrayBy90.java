import java.util.Scanner;

/*

1. You are given a number n, representing the number of rows and number of columns.
2. You are given n*n numbers, representing elements of 2d array a.
3. You are required to rotate the matrix by 90 degree clockwise and then
 display the contents using display function.

 Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*




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

Sample Output
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14

*/

public class RotateArrayBy90 {

  public static void rotateBy90(int arr[][]) {
    System.out.println("-------");
    swapRowsByColumns(arr);
    changeColumns(arr);
    print(arr);
  }

  // transpose of matrix

  public static void swapRowsByColumns(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr[0].length; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
  }

  // change columns

  public static void changeColumns(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      int leftIndex = 0;
      int rightIndex = arr[0].length - 1;
      while (leftIndex <= rightIndex) {
        int temp = arr[i][leftIndex];
        arr[i][leftIndex] = arr[i][rightIndex];
        arr[i][rightIndex] = temp;
        leftIndex++;
        rightIndex--;
      }

    }
  }

  public static void print(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
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
    rotateBy90(arr);
  }

}
