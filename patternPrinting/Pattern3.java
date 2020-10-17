import java.util.Scanner;

/*
          *
        * *
      * * *
    * * * *
  * * * * *
* * * * * *        


*/

public class Pattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int spaces = n - 1;
    for (int i = 0; i < n; i++) {
      for (int k = 0; k <= spaces; k++) {
        System.out.print("\t");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*\t");
      }
      System.out.println();
      spaces--;
    }
  }
}
