import java.util.Scanner;

/*

Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. 
Each testcases contains two lines of input. The first line denotes the size of the array N. 
The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1



*/

public class DutchNationalFlag {

  public static int[] getSortedArray(int arr[]) {
    int output[] = new int[arr.length];
    int c0 = 0, c1 = 0, c2 = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        c0++;
      } else if (arr[i] == 1) {
        c1++;
      } else if (arr[i] == 2) {
        c2++;
      }
    }

    for (int i = 0; i < c0; i++) {
      output[i] = 0;

    }
    for (int i = c0; i < c0+c1; ++i) {
      output[i] = 1;

    }
    for (int i = c0+c1; i < c0+c1+c2; i++) {
      output[i] = 2;
    }
    return output;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements");
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int output[] = getSortedArray(arr);
    System.out.println("-------");
    for (int i = 0; i < output.length; i++) {
      System.out.println(output[i]);
    }

  }
}
