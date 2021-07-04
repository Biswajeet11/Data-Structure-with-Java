import java.util.Scanner;

/*

Pascals Triangle


Input: 
5

Output:

     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]




*/

public class PascalTriangle {

  public int[][] solvePascalTriangle(int A) {

    int arr[][] = new int[A][];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new int[i + 1];
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == arr[i].length - 1) {
          arr[i][j] = 1;
        } else {
          arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
        }
      }
    }

    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    PascalTriangle pt = new PascalTriangle();
    int outputPascal[][] = pt.solvePascalTriangle(val);

    int m = outputPascal.length;
    int n = outputPascal[0].length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(outputPascal[i][j] + " ");
      }
      System.out.println();
    }
  }

}
