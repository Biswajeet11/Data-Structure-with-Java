import java.util.Scanner;

/*

Calculate Power
Send Feedback
Write a program to find x to the power n (i.e. x^n).
Take x and n from the user. You need to return the answer.
Do this recursively.

Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32

*/

public class CalculatePower {

  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }

    int smallAns = x * power(x, n - 1);
    return smallAns;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x");
    int x = sc.nextInt();
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    int powerValue = power(x, n);
    System.out.println(powerValue);
  }
}
