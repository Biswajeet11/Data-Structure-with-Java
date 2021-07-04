/*

Given an array of integers A and multiple values in B which represents number of times array A needs to be left rotated.

Input:
 
    A = [1, 2, 3, 4, 5]
    B = [2, 3]

Output:

  [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]

*/

public class MultipleLeftRotation {

  public int[] swap(int startIndex, int endIndex, int[] A) {
    while (startIndex < endIndex) {
      int temp = A[startIndex];
      A[startIndex] = A[endIndex];
      A[endIndex] = temp;
      startIndex++;
      endIndex--;
    }
    return A;
  }

  public int[] rotateArray(int[] A, int k) {
    k = k % A.length;
    swap(0, k - 1, A);
    swap(k, A.length - 1, A);
    swap(0, A.length - 1, A);
    return A;
  }

  public int[][] solveMultipleRotation(int[] A, int[] B) {
    int arr[][] = new int[B.length][A.length];

    for (int i = 0; i < B.length; i++) {
      int x[] = new int[A.length];
      for (int j = 0; j < A.length; j++) {
        x[j] = A[j];
      }
      arr[i] = rotateArray(x, B[i]);
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr1[] = { 1, 2, 3, 4, 5 };
    int numberOfRotations[] = { 2, 3 };
    MultipleLeftRotation mr = new MultipleLeftRotation();
    int arr2[][] = mr.solveMultipleRotation(arr1, numberOfRotations);
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
