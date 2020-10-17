import java.util.Scanner;
/*
First Index of Number
Send Feedback
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
1


*/

public class FirstIndexInArray {
  public static int firstIndex(int input[], int x, int startindex) {
    if (input.length == startindex) {
      return -1;
    }
    if (input[startindex] == x) {
      return startindex;
    }
    return firstIndex(input, x, startindex + 1);
  }

  public static int firstIndex(int input[], int x) {
    return firstIndex(input, x, 0);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Elements of n");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the value  of x");
    int x = sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int firstIndex = firstIndex(arr, x);
    System.out.println(firstIndex);
  }
}
