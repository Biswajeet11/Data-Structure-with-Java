import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

Given a a low value and high value print the prime numbers between them

*/

public class PrintPrimeNumbers {

  public static List<Integer> rangeofPrimeNumbers(int low, int high) {

    List<Integer> listPrime = new ArrayList<Integer>();

    for (int n = low; n <= high; n++) {
      int count = 0;
      for (int divide = 2; divide * divide <= n; divide++) {
        if (n % divide == 0) {
          count++;
          break;
        }
      }
      if (count == 0) {
        listPrime.add(n);
      }
    }
    return listPrime;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Low value");
    int low = sc.nextInt();
    System.out.println("Enter High value");
    int high = sc.nextInt();
    List<Integer> arr = rangeofPrimeNumbers(low, high);
    // for (int i = 0; i < arr; i++) {
    System.out.println(arr);
    // }
  }
}
