import java.util.Scanner;

/*

1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.



Sample Input
 994543234
 4
 
 Sample Output
 3


*/

public class DigitsFrequency {

  public static int getFrequency(int n, int digit) {
    int frequency = 0;
    while (n != 0) {
      int r = n % 10;
      if (r == digit) {
        frequency++;
      }
      n = n / 10;
    }
    return frequency;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = sc.nextInt();
    System.out.println("Enter the digit");
    int digit = sc.nextInt();
    int freq = getFrequency(number, digit);
    System.out.println(freq);
  }

}
