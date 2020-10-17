import java.util.Scanner;

/*

                      1	
                    2	3	2	
                  3	4	5	4	3	
                    2	3	2	
                      1	

*/

public class Pattern15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int spaces = n / 2;
    int stars = 0;
    int overAllValue = 0;
    for (int i = 0; i < n; i++) {
      int value = overAllValue + 1;
      for (int j = 0; j <= spaces; j++) {
        System.out.print("\t");
      }
      for (int k = 0; k <= stars; k++) {
        System.out.print(value + "\t");
        if (k < stars / 2) {
          value++;
        } else {
          value--;
        }
      }
      System.out.println();
      if (i <= spaces) {
        spaces--;
        stars += 2;
        overAllValue++;
      } else {
        spaces++;
        stars -= 2;
        overAllValue--;
      }
    }
  }
}
