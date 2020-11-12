/*


Check whether the trees are mirror image of each other


Input Format
Input is managed for you

Output Format
Output is managed for you

Constraints
None

Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
12
100 200 -1 300 500 -1 600 -1 -1 400 -1 -1

Sample Output
true


*/

package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class MirrorImage {

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

  public static void main(String[] args) {
    int arr1[] = { 10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1 };
    int arr2[] = { 100, 200, -1, 300, 500, -1, 600, -1, -1, 400, -1, -1 };
    MirrorImage mi = new MirrorImage();
    Node<Integer> tree1 = mi.construct(arr1);
    Node<Integer> tree2 = mi.construct(arr2);

    boolean isMirror = isMirrorImage(tree1, tree2);
    System.out.println(isMirror);
  }
}
