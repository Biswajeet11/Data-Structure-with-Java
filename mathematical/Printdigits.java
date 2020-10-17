import java.util.Scanner;

/*

Given a number 6788089989
output:
6
7
8
8
0
8
9
9
8
9

*/

public class Printdigits {

  public static int getNumberofDigits(int n) {
    int count = 0;
    while (n != 0) {
      n = n / 10;
      count++;
    }
    return count;
  }

  public static void printTheDigits(int n) {
    int numberOfDigits = getNumberofDigits(n);
    int digit = n;
    int divider = (int) Math.pow(10, numberOfDigits - 1);
    while (divider != 0) {
      digit = n / divider;
      System.out.println(digit);
      n = n % divider;
      divider = divider / 10;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printTheDigits(n);
  }
}
