import java.util.Scanner;

/*

              *	
            *	*	*	
          *	*	*	*	*	
            *	*	*	
              *	
    
    */

public class Pattern5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int spaces = n / 2;
    int stars = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= spaces; j++) {
        System.out.print("\t");
      }
      for (int k = 0; k <= stars; k++) {
        System.out.print("*\t");
      }
      System.out.println();
      if (i <= spaces) {
        spaces--;
        stars += 2;
      } else {
        spaces++;
        stars -= 2;
      }
    }
  }
}
