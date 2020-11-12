/*

Mirror Image of a tree are symmetric



Input Format
Input is managed for you

Output Format
Output is managed for you
Constraints
None
Sample Input
20
10 20 50 -1 60 -1 -1 30 70 -1 80 -1 90 -1 -1 40 100 -1 110 -1 -1 -1
Sample Output
true



*/

package genericTree;

import java.util.Stack;

import java.util.ArrayList;

public class IsSymmetric {

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

  public static boolean isMirrorImage(Node<Integer> node1, Node<Integer> node2) {

    if (node1.children.size() != node2.children.size()) {
      return false;
    }

    for (int i = 0; i < node1.children.size(); i++) {

      int j = node1.children.size() - i - 1;

      Node<Integer> leftSubTree = node1.children.get(i);
      Node<Integer> rightSubTree = node2.children.get(j);

      if (!isMirrorImage(leftSubTree, rightSubTree)) {
        return false;
      }
    }
    return true;
  }

  public static boolean symmetric(Node<Integer> node) {

    return isMirrorImage(node, node);

  }

  public static void main(String[] args) {
    IsSymmetric sym = new IsSymmetric();
    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, -1, 90, -1, -1, 40, 100, -1, 110, -1, -1, -1 };
    Node<Integer> tree = sym.construct(arr);
    boolean symmetricValue = symmetric(tree);
    System.out.println(symmetricValue);

  }
}
