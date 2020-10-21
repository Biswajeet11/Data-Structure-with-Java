import java.util.Scanner;

/*
1. You are given an array(arr) of integers.
2. You have to find the k-th smallest element in the given array using the quick-select algorithm.

*/

public class QuickSelect {

  public static int quickSelect(int arr[], int low, int high, int k) {

    int pivot = arr[high];
    int pivotIndex = divideTheArray(arr, pivot, low, high);
    if (pivotIndex < k) {
      return quickSelect(arr, pivotIndex + 1, high, k);
    } else if (pivotIndex > k) {
      return quickSelect(arr, low, pivotIndex - 1, k);
    } else {
      return arr[pivotIndex];
    }
  }

  public static int divideTheArray(int arr[], int pivot, int low, int high) {
    int i = low;
    int j = low;
    while (i <= high) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }

    return j - 1;

  }

  public static int[] swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the kth samllest element");
    int kthSmallest = sc.nextInt();

    int kthSmallestValue = quickSelect(arr, 0, arr.length - 1, kthSmallest-1);
    System.out.println("Kth smallest " + kthSmallestValue);
  }

}
