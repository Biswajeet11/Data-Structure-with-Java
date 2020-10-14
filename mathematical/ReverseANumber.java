import java.util.Scanner;

public class ReverseANumber {
  public static int reversedNumber(int n) {
    int s = 0, r = 0;
    while (n != 0) {
      r = n % 10;
      s = s * 10 + r;
      n = n / 10;
    }
    return s;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int reversedNumber = reversedNumber(n);
    System.out.println(reversedNumber);
  }
}
