import java.util.Scanner;

/*

1. You are given a number n, representing the count of items.
2. You are given n numbers, representing the values of n items.
3. You are given n numbers, representing the weights of n items.
3. You are given a number "cap", which is the capacity of a bag you've.
4. You are required to calculate and print the maximum value that can be created in the bag without 
     overflowing it's capacity.

Note -> Each item can be taken 0 or 1 number of times. You are not allowed to put the same item 
               again and again.
Input Format
A number n
v1 v2 .. n number of elements
w1 w2 .. n number of elements
A number cap
Output Format
A number representing the maximum value that can be created in the bag without overflowing it's capacity
Constraints
1 <= n <= 20
0 <= v1, v2, .. n elements <= 50
0 < w1, w2, .. n elements <= 10
0 < cap <= 10
Sample Input
5
15 14 10 45 30
2 5 1 3 4
7
Sample Output
75


*/

public class knapSack {
  public static int getValue(int wt[], int profit[], int target) {
    int dp[][] = new int[wt.length + 1][target + 1];

    for (int i = 0; i < dp.length; i++) {
      dp[i][0] = 0;
    }

    for (int j = 1; j < dp[0].length; j++) {
      dp[0][j] = 0;
    }

    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        int value = profit[i - 1];
        int wgt = wt[i - 1];
        if (j >= wgt) {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wgt] + value);
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    return dp[wt.length][target];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n = sc.nextInt();
    int profit[] = new int[n];
    int wt[] = new int[n];

    for (int i = 0; i < n; i++) {
      profit[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      wt[i] = sc.nextInt();
    }
    System.out.println("Enter target value");
    int target = sc.nextInt();
    int value = getValue(wt, profit, target);
    System.out.println(value);
  }

}
