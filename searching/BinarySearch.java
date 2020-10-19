import java.util.Scanner;

public class BinarySearch {

  public static int getSearchedValue(int arr[], int x) {
    int l = 0;
    int r = arr.length - 1;
    int mid = 0;
    while (l < r) {
      mid = (l + r) / 2;
      if (arr[mid] == x) {
        return mid;
      } else if (arr[mid] < x) {
        l = mid;
      } else {
        r = mid;
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    int value = getSearchedValue(arr, x);
    System.out.println(value);

  }
}
