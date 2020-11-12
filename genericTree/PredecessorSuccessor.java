/*

Input Format
Input is managed for you
Output Format
Output is managed for you
Constraints
None
Sample Input
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
-120
Sample Output
Predecessor = 110
Successor = 90








*/

package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class PredecessorSuccessor {
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

  static Node<Integer> predecessor;
  static Node<Integer> successor;
  static int state;

  public static void predecessorAndSuccessor(Node<Integer> node, int data) {
    if (state == 0) {
      if (node.data == data) {
        state = 1;
      } else {
        predecessor = node;
      }
    } else if (state == 1) {
      successor = node;
      state = 2;
    }

    for (Node<Integer> child : node.children) {
      predecessorAndSuccessor(child, data);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    PredecessorSuccessor ps = new PredecessorSuccessor();
    Node<Integer> node = ps.construct(arr);
    int data = 120;
    predecessor = null;
    successor = null;
    predecessorAndSuccessor(node, data);
    if (predecessor == null) {
      System.out.println("Predecessor = Not found");
    } else {
      System.out.println("Predecessor = " + predecessor.data);
    }

    if (successor == null) {
      System.out.println("Successor = Not found");
    } else {
      System.out.println("Successor = " + successor.data);
    }
  }
}
