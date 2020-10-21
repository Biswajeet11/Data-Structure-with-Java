import java.util.Scanner;

public class QuickSort {

  public static void quickSort(int arr[], int low, int high) {
    if (low > high) {
      return;
    }
    int pivot = arr[high];
    int pivotIndex = divideTheArray(arr, pivot, low, high);
    quickSort(arr, low, pivotIndex - 1);
    quickSort(arr, pivotIndex + 1, high);

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

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

  public static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    quickSort(arr, 0, arr.length - 1);
    printArray(arr);

  }
}
