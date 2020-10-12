import java.util.Scanner;

/*
              1	
              1	1	
              1	2	1	
              1	3	3	1	
              1	4	6	4	1


              nCr+1= nCr*(n-r)/r+1
              make use of previous value to make tha next value


              */

public class Pattern13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int iCj = 1;
      for (int j = 0; j < i; j++) {
        System.out.print(iCj + "\t");
        int iCjPlus1 = (iCj * (i - j)) / (j + 1);
        iCj = iCjPlus1;
      }
      System.out.println();
    }
  }
}
