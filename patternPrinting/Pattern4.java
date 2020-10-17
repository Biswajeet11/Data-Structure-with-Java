/*
* * * * * * 
  * * * * *
    * * * *
      * * *
        * *
          *
*/



import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int spaces=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=spaces;j++){
                System.out.print("\t");
            }
            for(int k=n;k>i;k--){
                System.out.print("*\t");
            }
            spaces++;
            System.out.println();
        }
    }
}
