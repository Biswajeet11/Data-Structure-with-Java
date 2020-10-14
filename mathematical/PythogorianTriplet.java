import java.util.Scanner;

/*

a, an integer
b, an integer
c, an integer

Given 3 input check if the given integers are a pythogorian triplet

*/

public class PythogorianTriplet {

  public static boolean isPythogorianTriplet(int a, int b, int c) {
    int lh = 0;
    int rh = 0;
    if (b > a && b > c) {
      lh = b * b;
      rh = a * a + c * c;
    } else if (c > a && c > b) {
      lh = c * c;
      rh = a * a + b * b;
    } else {
      lh = a * a;
      rh = b * b + c * c;
    }
    boolean isTriplet = isPythogorianTriplet(lh, rh);
    return isTriplet;
  }

  public static boolean isPythogorianTriplet(int lh, int rh) {
    if (lh == rh) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean isPythogorian = isPythogorianTriplet(a, b, c);
    System.out.println(isPythogorian);

  }
}
