import java.util.Scanner;

/*

Question
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number "tar".
4. You are required to calculate and print true or false, if there is a subset 
the elements of which add up to "tar" or not.

Input Format
A number n
n1
n2
.. n number of elements
A number tar
Output Format
true or false as required
Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 20
0 <= tar <= 50
Sample Input
5
4
2
7
1
3
10
Sample Output
true



*/

public class TargetSumSubsets {

  public static boolean isTargetSumPossible(int arr[], int target) {
    int m = arr.length + 1;
    int n = target + 1;
    boolean dp[][] = new boolean[m][n];
    for (int i = 0; i < dp.length; i++) {
      dp[i][0] = true;
    }
    for (int j = 1; j < dp[0].length; j++) {
      dp[0][j] = false;
    }

    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if (dp[i - 1][j] == true) {
          dp[i][j] = true;
        } else if (i == j) {
          dp[i][j] = true;
        } else {
          int value = arr[i - 1];
          if (j >= value && dp[i - 1][j - value] == true) {
            dp[i][j] = true;
          }
        }
      }
    }
    return dp[dp.length - 1][target];

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target");
    int target = sc.nextInt();
    boolean isTarget = isTargetSumPossible(arr, target);
    System.out.println(isTarget);
  }
}
