/*

Question
1. You are given a partially written GenericTree class.
2. You are required to complete the body of linearize function. 
The function is expected to create a linear tree 
i.e. every node will have a single child only. 
3. Input and Output is managed for you.

Input Format
Input is managed for you

Output Format
Output is managed for you
Constraints
None
Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
Sample Output
10 -> 20, .
20 -> 50, .
50 -> 60, .
60 -> 30, .
30 -> 70, .
70 -> 80, .
80 -> 110, .
110 -> 120, .
120 -> 90, .
90 -> 40, .
40 -> 100, .
100 -> .


*/

package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class LinearizeTree {
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

  public static void printTree(Node<Integer> root) {
    String str = root.data + ":";
    for (Node<Integer> child : root.children) {
      str += child.data + ",";
    }
    System.out.println(str);

    for (Node<Integer> child : root.children) {
      printTree(child);
    }
  }

  public static void linearize(Node<Integer> node) {
    for (Node<Integer> child : node.children) {
      linearize(child);
    }
    while (node.children.size() > 1) {
      Node<Integer> lastChild = node.children.remove(node.children.size() - 1);
      Node<Integer> secondLastChild = node.children.get(node.children.size() - 1);
      Node<Integer> secondLastTail = getTail(secondLastChild);
      secondLastTail.children.add(lastChild);
    }
  }

  public static Node<Integer> getTail(Node<Integer> node) {
    while (node.children.size() == 1) {
      node = node.children.get(0);
    }
    return node;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    LinearizeTree lt = new LinearizeTree();
    Node<Integer> root = lt.construct(arr);
    linearize(root);
    printTree(root);
  }
}
