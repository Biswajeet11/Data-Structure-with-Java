import java.util.Stack;

class NextGreaterElement {
  public static void nextGreater(int arr[]) {
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      while (!st.isEmpty() && arr[i] > st.peek()) {
        int popValue = st.pop();
        System.out.println(popValue + "--> " + arr[i]);
      }
      st.push(arr[i]);
    }
    while (!st.isEmpty()) {
      int popValue = st.pop();
      System.out.println(popValue + "--> " + -1);
    }

  }

  public static void main(String args[]) {
    int arr[] = { 2, 1, 3, 8, 6, 7, 5 };
    nextGreater(arr);
  }
}