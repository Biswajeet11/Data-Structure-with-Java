import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

  public static void getStockSpan(int arr[]) {
    Stack<Integer> st = new Stack<>();
    int output[] = new int[arr.length];
    output[0] = 1;

    for (int i = 0; i < arr.length; i++) {

      st.push(arr[i]);
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements of  array");
    int num = sc.nextInt();
    int arr[] = new int[num];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

  }
}
