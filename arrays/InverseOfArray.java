import java.util.Scanner;

/*
Sample Input:
5
4
0
2
3
1

Sample Output:
1
4
2
3
0

*/

public class InverseOfArray {

  public static int [] getInversedArray(int arr[]) {
    int inverse[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int value = arr[i];
      inverse[value] = i;
    }
    return inverse;
  }

  public static void display(int arr[]) {
    for (int i : arr) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    getInversedArray(arr);
    display(arr);

  }
}
