import java.util.Scanner;
import java.util.Stack;

/*

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the prices of a share on n days.
3. You are required to find the stock span for n days.
4. Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.

e.g.
for the array [2 5 9 3 1 12 6 8 7]
span for 2 is 1
span for 5 is 2
span for 9 is 3
span for 3 is 1
span for 1 is 1
span for 12 is 6
span for 6 is 1
span for 8 is 2
span for 7 is 1

*/

public class StockSpan {
  public static int[] getStockSpan(int arr[]) {
    Stack<Integer> st = new Stack<>();
    int output[] = new int[arr.length];
    output[0] = 1;
    st.push(0);

    for (int i = 1; i < arr.length; i++) {

      while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
        st.pop();
      }

      if (st.isEmpty()) {
        output[i] = i + 1;
      } else {
        output[i] = i - st.peek();
      }
      st.push(i);
    }

    return output;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter the number of elements");
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int output[] = getStockSpan(arr);
    for (int i = 0; i < output.length; i++) {
      System.out.print(output[i]);
    }
  }

}
