package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class ZigZagOrderPrint {
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

  public static void displayZigZag(Node<Integer> node) {
    Stack<Node<Integer>> mst = new Stack<>();

    mst.add(node);

    Stack<Node<Integer>> cst = new Stack<>();
    int level = 0;

    while (mst.size() > 0) {
      node = mst.pop();

      System.out.print(node.data + " ");

      if (level % 2 == 1) {
        for (int i = 0; i < node.children.size(); i++) {
          Node<Integer> child = node.children.get(i);
          cst.push(child);
        }
      } else {
        for (int i = node.children.size()-1; i >= 0; i--) {
          Node<Integer> child = node.children.get(i);
          cst.push(child);
        }
      }
      if (mst.size() == 0) {
        mst = cst;
        cst = new Stack<>();
        level++;
        System.out.println();
      }
    }

  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    ZigZagOrderPrint lt = new ZigZagOrderPrint();
    Node<Integer> root = lt.construct(arr);
    displayZigZag(root);

  }

}
