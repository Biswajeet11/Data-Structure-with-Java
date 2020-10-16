import java.util.Scanner;

/*

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

public class StairClimbing {

  public static int getStairClimbingValue(int n) {
    if (n < 0) {
      return 0;
    }
    if (n == 0) {
      return 1;
    }
    return getStairClimbingValue(n - 1) + getStairClimbingValue(n - 2) + getStairClimbingValue(n - 3);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int stairsCount = getStairClimbingValue(n);
    System.out.println(stairsCount);
  }
}
