import java.util.Scanner;

/*

1. You are given an array(arr) of integers and a pivot.
2. You have to re-arrange the given array in such a way that all elements smaller or equal to pivot lie on the left side of pivot and all elements greater than pivot lie on its right side.
3. You have to achieve this in linear time.

Sample Input
5
7 
-2 
4 
1 
3
3

Sample Output

Swapping -2 and 7
Swapping 1 and 7
Swapping 3 and 4

-2 1 3 7 4 
ref:
https://www.youtube.com/watch?v=MZaf_9IZCrc
*/

public class PartitionOfArray {

  public static int[] divideTheArray(int arr[], int pivot) {
    int i = 0;
    int j = 0;

    while (i < arr.length) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      }else {
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
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the pivot");
    int p = sc.nextInt();
    int dividedArray[] = divideTheArray(arr, p);

    for (int i = 0; i < dividedArray.length; i++) {
      System.out.print(dividedArray[i]);
    }
  }

}
