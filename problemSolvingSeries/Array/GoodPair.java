import java.util.Arrays;
/*
Problem Description

Given an array A and a integer B. A pair(i,j) in the array is a good pair 
if i!=j and (A[i]+A[j]==B). Check if any good pair exist or not.

Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return 1 if good pair exist otherwise return 0.

*/

public class GoodPair {

  public int solveGoodPair(int[] A, int B) {
    long count = 0;
    int l = 0;
    int r = A.length - 1;
    Arrays.sort(A);
    while (l < r) {
      if (A[l] + A[r] < B) {
        l++;
      } else if (A[l] + A[r] > B) {
        r--;
      } else if (A[l] == A[r]) {
        count += 1l * (r - l + 1) * (r - l) / 2;
        break;
      } else {
        int left = A[l];
        int right = A[r];
        int c1 = 0;
        int c2 = 0;
        while (l < A.length && A[l] == left) {
          c1++;
          l++;
        }
        while (r >= 0 && A[r] == right) {
          c2++;
          r--;
        }
        count += c1 * c2;
      }
    }
    return (int) count;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    int k = 7;
    GoodPair gp = new GoodPair();
    int value = gp.solveGoodPair(arr, k);
    System.out.println(value);
  }

}
