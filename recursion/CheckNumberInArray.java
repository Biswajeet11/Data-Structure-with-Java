import java.util.Scanner;
/*

Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false

*/

public class CheckNumberInArray {
  public static boolean checkNumber(int input[], int x) {
    return checkNumber(input, x, 0);
  }

  public static boolean checkNumber(int input[], int x, int startindex) {
    if (startindex == input.length) {
      return false;
    }
    if (input[startindex] == x) {
      return true;
    }

    return checkNumber(input, x, startindex + 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the value of x");
    int x = sc.nextInt();
    System.out.println("Enter Elements of n");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    boolean isNumberPresent = checkNumber(arr, x);
    System.out.println(isNumberPresent);
  }
}
