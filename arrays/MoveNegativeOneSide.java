import java.util.Scanner;

/*
Move all negative numbers to beginning and positive to end with constant extra space

An array contains both positive and negative numbers in random order.
Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5


*/

public class MoveNegativeOneSide {

  public static int[] moveNegative(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]<0){
        

      }
    }
    return arr;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter the number of elements");
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

  }
}
