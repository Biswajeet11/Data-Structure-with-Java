import java.util.Scanner;

/*

Calucate the number of digits in a Number


*/

public class DigitsOfNumber {

  public static int calculateDigits(int n) {
    int count = 0;
    while (n != 0) {
      n = n /10;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int digit = sc.nextInt();
    int digitOutput = calculateDigits(digit);
    System.out.println(digitOutput);
  }
}
