import java.util.Scanner;
/*

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.


Input:
5

3
1
0
7
5


Sample Output
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	


*/

public class BarChart {

  public static void printBarChart(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      while (arr[i] != 0) {
        System.out.println("*");
        arr[i]--;
      }
      System.out.print("");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    printBarChart(arr);
  }
}
