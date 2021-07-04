import java.util.Scanner;

public class ListOfRotatedArrays {
  public static int[] swap(int startIndex, int endIndex, int A[]) {
    int temp = 0;
    while (startIndex < endIndex) {
      temp = A[startIndex];
      A[startIndex] = A[endIndex];
      A[endIndex] = temp;
      startIndex++;
      endIndex--;
    }
    return A;
  }

  public static int[] rotateArray(int A[], int k) {
    swap(0, A.length - k - 1, A);
    swap(k, A.length - 1, A);
    swap(0, A.length - 1, A);
    return A;
  }

  public static void printArray(int A[], int k) {
    int arr[] = rotateArray(A, k);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }
    System.out.println(" ");
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numTestCases = sc.nextInt();

    for (int i = 0; i < numTestCases; i++) {
      int numOfElements = sc.nextInt();
      int arr[] = new int[numOfElements];

      for (int j = 0; j < numOfElements; j++) {
        arr[j] = sc.nextInt();
      }
      int k = sc.nextInt();
      printArray(arr, k);
    }

  }
}
