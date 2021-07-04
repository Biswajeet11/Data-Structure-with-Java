import java.util.Scanner;

/*

Add One To Number
Problem Description

Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.


Example Input
Input 1:

[1, 2, 3]


Example Output
Output 1:

[1, 2, 4]


The returned  should be [1, 2, 4] as 123 + 1 = 124.



*/

public class AddOneToNumber {

  public int[] plusOne(int[] A) {
    int carry = 1, p = 0;
    for (int i = A.length - 1; i >= p; i--) {
      int sum = A[i] + carry;
      A[i] = sum % 10;
      carry = sum / 10;
    }
    if (carry > 0) {
      int b[] = new int[A.length + 1];
      b[0] = carry;
      for (int i = 1; i < A.length + 1; i++)
        b[i] = A[i - 1];
      return b;
    } else {
      int pp = 0;
      while (A[pp] == 0)
        pp++;
      int b[] = new int[A.length - pp];
      for (int i = pp; i < A.length; i++)
        b[i - pp] = A[i];
      return b;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    AddOneToNumber add = new AddOneToNumber();
    int arrValues[] = add.plusOne(arr);

    for (int i = 0; i < arrValues.length; i++) {
      System.out.println(arrValues[i]);
    }

  }

}
