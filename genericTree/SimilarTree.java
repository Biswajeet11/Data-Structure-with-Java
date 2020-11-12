/*

Question
1. You are given a partially written GenericTree class.
2. You are required to complete the body of areSimilar function. 
The function is expected to check if the two trees passed to it are similar in shape or not.
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
24
1 2 5 -1 6 -1 -1 3 7 -1 8 11 -1 12 -1 -1 9 -1 -1 4 10 -1 -1 -1
Sample Output
true

*/

package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class SimilarTree {

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

  public static boolean isSimilarTree(Node<Integer> node1, Node<Integer> node2) {

    if (node1.children.size() != node2.children.size()) {
      return false;
    }

    for (int i = 0; i < node1.children.size(); i++) {
      Node<Integer> tree1Child = node1.children.get(i);
      Node<Integer> tree2Child = node2.children.get(i);

      boolean isSimilar = isSimilarTree(tree1Child, tree2Child);
      if (isSimilar == false) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int arr1[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    int arr2[] = { 1, 2, 5, -1, 6, -1, -1, 3, 7, -1, 8, 11, -1, 12, -1, -1, 9, -1, -1, 4, 10, -1, -1, -1 };

    SimilarTree st = new SimilarTree();
    Node<Integer> tree1 = st.construct(arr1);
    Node<Integer> tree2 = st.construct(arr2);
    boolean isSimilar = isSimilarTree(tree1, tree2);
    System.out.println(isSimilar);
  }
}
