package genericTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {

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

  public static void levelOrder(Node<Integer> node) {

    Queue<Node<Integer>> q = new LinkedList<Node<Integer>>();
    q.add(node);

    while (q.size() > 0) {
      node = q.remove();
      System.out.print(node.data + " ");

      for (Node<Integer> child : node.children) {
        q.add(child);
      }

      System.out.println("");

    }

  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    LevelOrderTraversal lt = new LevelOrderTraversal();
    Node<Integer> root = lt.construct(arr);
    levelOrder(root);

  }
}
