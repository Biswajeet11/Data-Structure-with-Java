import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

  public static void nextGreater(int arr[]) {
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < arr.length; i++) {

      while (!st.empty() && arr[i] > st.peek()) {
        int popValue = st.pop();
        System.out.println("Next greater for " + popValue + " is " + arr[i]);

      }
      st.push(arr[i]);
    }

    while (!st.isEmpty()) {
      int popValue = st.pop();
      System.out.println("Next Greater element" + popValue + " is " + "-1");
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

    nextGreater(arr);

  }
}
