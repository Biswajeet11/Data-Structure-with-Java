import java.util.Scanner;

/*

1.Set MIN to location 0
2.Search the minimum element in the list
3.Swap with value at location MIN
4.Increment MIN to point to next element
5.Repeat until the list is sorted



*/

public class SelectionSort {

  public static int[] getSortedArray(int arr[]) {

    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;

        }
      }
      swap(minIndex, i, arr);
    }
    return arr;

  }

  public static int[] swap(int i, int j, int arr[]) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int m = sc.nextInt();
    int arr[] = new int[m];
    for (int i = 0; i < m; i++) {
      arr[i] = sc.nextInt();
    }
    int output[] = getSortedArray(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(output[i]);
    }
  }

}
