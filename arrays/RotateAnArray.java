import java.util.Scanner;

/*

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to
the left for negative values of k.

*/

public class RotateAnArray {

  public static int[] reverseArray(int arr[], int i, int j) {
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    return arr;
  }

  public static void rotateArray(int arr[], int k) {
    k = k % arr.length;
    if (k < 0) {
      k = k + arr.length;
    }
    // reverse the first half of the array
    reverseArray(arr, 0, arr.length - k - 1);

    // reverse the second half of the array
    reverseArray(arr, arr.length - k, arr.length - 1);

    // reverse the whole array
    reverseArray(arr, 0, arr.length - 1);

  }

  public static void display(int arr[]) {
    for (int i : arr) {
      System.out.print(i);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the value of k");
    int k = sc.nextInt();
    System.out.println("Enter the elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("The rotated elements");
    rotateArray(arr, k);
    display(arr);
  }
}
