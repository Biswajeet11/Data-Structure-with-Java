import java.util.Scanner;
/*

1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.

*/

public class Fibonacci {

  public static int getFib(int n) {
    int arr[] = new int[n + 2];
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr[n];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int fib = getFib(n);
    System.out.println(fib);

  }
}