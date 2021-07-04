/*

Odd Even Subsequences
Given an array of integers A of size N. Find the longest subsequence of A which is odd-even.

A subsequence is said to odd-even in the following cases:

The first element of the subsequence is odd, second element is even, third element is odd and so on. For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]

The first element of the subsequence is even, second element is odd, third element is even and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]

Return the maximum possible length of odd-even subsequence.

Note: An array B is a subsequence of an array A if B can be obtained from A by deletion of several (possibly, zero or all) elements.


Input 1:
    A = [1, 2, 2, 5, 6]
Output 1:
    4
    Explanation 1:
        Maximum length odd even subsequence is [1, 2, 5, 6]

Input 2:
    A = [2, 2, 2, 2, 2, 2]
Output 2:
    1
    Explanation 2:
        Maximum length odd even subsequence is [2]
*/

import java.util.Scanner;

public class OddEvenSubsequence {

  public int sequenceSolve(int[] A) {
    int flag = 0, count = 0;
    flag = A[0] % 2 == 0 ? 0 : 1; // check initial value is even or odd and set flag according to it

    for (int i = 1; i < A.length; i++) { // loop from i=1 to n
      if (A[i] % 2 == 0 && flag == 1) { // if number is divisible by 2 and flag is 1 increment count and set flag as 0
        count++;
        flag = 0;
      } else if (A[i] % 2 != 0 && flag == 0) { // if number is not divisible by 2 and flag is 0 increment count and set
                                               // flag as 1
        count++;
        flag = 1;
      }
    }
    return count + 1; // return counter+1
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 2, 5, 6 };
    OddEvenSubsequence seq = new OddEvenSubsequence();
    int value = seq.sequenceSolve(arr);
    System.out.println(value);
  }
}
