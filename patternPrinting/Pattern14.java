import java.util.Scanner;

/*
1. You are given a number n.
2. You've to write code to print it's multiplication table up to 10 in format given below.

x * 1 = x
x * 2 = 2x
x * 3 = 3x
x * 4 = 4x
x * 5 = 5x
x * 6 = 6x
x * 7 = 7x
x * 8 = 8x
x * 9 = 9x
x * 10 = 10x

*/

public class Pattern14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      int value = i * n;
      System.out.println(n + "* " + i + " =" + value);
    }
  }
}
