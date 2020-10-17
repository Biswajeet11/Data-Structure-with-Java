import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

Input:
1440

Output:
2 2 2 2 2 3 3 5

*/

public class PrimeFactorization {

  public static List<Integer> getPrimefactors(int n) {
    List<Integer> output = new ArrayList<Integer>();
    for (int i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        System.out.println(i);
        output.add(i);
        n = n / i;
      }
    }
    if (n != 1) {
      output.add(n);
    }
    return output;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> primeFactors = getPrimefactors(n);
    System.out.println(primeFactors);
  }
}
