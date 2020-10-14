import java.util.Scanner;

/*

1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.


*/

public class GcdAndLcm {

  public static int getHcf(int n1, int n2) {
    while (n1 % n2 != 0) {
      n2 = n1 % n2;
      n1 = n2;
    }
    return n2;
  }

  public static int getLcm(int n1, int n2) {
    int hcf = getHcf(n1, n2);
    int lcm = (n1 * n2) / hcf;
    return lcm;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int hcfValue = getHcf(n1, n2);
    int lcmValue = getLcm(n1, n2);
    System.out.println("HCF Value " + hcfValue);
    System.out.println("LCM Value " + lcmValue);
  }
}
