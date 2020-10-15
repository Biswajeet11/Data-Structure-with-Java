import java.util.Scanner;

/*


1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.

*/

public class ReverseAnArray {

  public static int[] getReversedArray(int arr[]) {
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of digits");
    int n = sc.nextInt();
    int arr[] = new int[n];

    System.out.println("Enter the array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Reversed Array");
    int outputArr[] = getReversedArray(arr);
    for (int i = 0; i < outputArr.length; i++) {
      System.out.println(outputArr[i]);
    }

  }

}
