package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class FindElement {
  class Node<T> {
    T data;
    ArrayList<Node<T>> children;

    Node(T data) {
      this.data = data;
      children = new ArrayList<Node<T>>();
    }
  }

  public Node<Integer> construct(int arr[]) {
    Stack<Node<Integer>> st = new Stack<>();
    Node<Integer> root = null;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        if (st.size() > 0) {
          Node<Integer> newNode = new Node<Integer>(arr[i]);
          st.peek().children.add(newNode);
          st.push(newNode);
        } else {
          root = new Node<Integer>(arr[i]);
          st.push(root);
        }
      }
    }
    return root;
  }

  public static boolean find(Node<Integer> node, int k) {
    if (node.data == k) {
      return true;
    }
    for (Node<Integer> child : node.children) {
      boolean isFound = find(child, k);
      if (isFound) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    FindElement lt = new FindElement();
    Node<Integer> root = lt.construct(arr);
    int k = 110;
    boolean isFound = find(root, k);
    System.out.println(isFound);
  }
}
