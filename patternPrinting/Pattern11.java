import java.util.Scanner;

/*


            1	
            2	  3	
            4	  5	  6	
            7	  8	  9	  10	
            11	12	13	14	15

*/

public class Pattern11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        count++;
        System.out.print(count);
      }
      System.out.println();
    }
  }
}
