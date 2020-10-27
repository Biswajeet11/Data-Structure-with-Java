import java.util.Scanner;
/*

Question
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.
Input Format
A number n
Output Format
A number representing the number of ways to climb the stairs from 0 to top.
Constraints
0 <= n <= 20
Sample Input
4
Sample Output
7



*/

public class StairCase {

  public static int numberOfWaysToClimb(int n, int storage[]) {

    if (n < 0) {
      return 0;
    }
    if (n == 0) {
      return 1;
    }

    if (storage[n] > 0) {
      return storage[n];
    }

    int ans = numberOfWaysToClimb(n - 1, storage) + numberOfWaysToClimb(n - 2, storage)
        + numberOfWaysToClimb(n - 3, storage);
    storage[n] = ans;
    return storage[n];
  }

  public static int numberOfWaysToClimbTab(int n) {
    int dp[] = new int[n + 1];
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        dp[i] = dp[i - 1];
      }
      if (i == 2) {
        dp[i] = dp[i - 1] + dp[i - 2];
      }
      if (i >= 3) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
      }
    }
    return dp[n];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Stairs");
    int n = sc.nextInt();
    int numberofWays = numberOfWaysToClimb(n, new int[n + 1]);
    System.out.println("numberofWays" + numberofWays);
    System.out.println("--------------");
    int numberOfWaysToClimb = numberOfWaysToClimbTab(n);
    System.out.println("numberOfWaysToClimb" + numberOfWaysToClimb);
  }
}
