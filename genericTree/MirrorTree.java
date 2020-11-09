package genericTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MirrorTree {
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

  public void mirror(Node<Integer> node) {
    for (Node<Integer> child : node.children) {
      mirror(child);
    }
    Collections.reverse(node.children);
  }

  public void printTree(Node<Integer> root) {
    String str = root.data + ":";
    for (Node<Integer> child : root.children) {
      str += child.data + ",";
    }
    System.out.println(str);

    for (Node<Integer> child : root.children) {
      printTree(child);
    }

  }


  public static void main(String[] args) {
    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    MirrorTree mt = new MirrorTree();
    Node<Integer> root = mt.construct(arr);
    mt.mirror(root);
    mt.printTree(root);
  
  }
}
