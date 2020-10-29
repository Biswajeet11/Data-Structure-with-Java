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
    int i = 0;
    int j = 0;

    while (i < arr.length) {
      if (arr[i] < 0) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    return arr;

  }

  public static int[] swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements");
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int output[] = moveNegative(arr);
    System.out.println("-------");
    for (int i = 0; i < output.length; i++) {
      System.out.println(output[i]);
    }

  }
}
