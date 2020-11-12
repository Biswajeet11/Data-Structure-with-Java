/*
Question
1. You are given a partially written GenericTree class.
2. You are required to complete the body of nodeToRootPath function.
The function is expected to return in form of linked list the path from element to root, if the element with data is found.
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
120
Sample Output
[120, 80, 30, 10]


*/

package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class NodeToRootPath {
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

  public static ArrayList<Node<Integer>> nodeToRootPath(Node<Integer> node, int k) {
    if (node.data == k) {
      ArrayList<Node<Integer>> newArrayList = new ArrayList<Node<Integer>>();
      newArrayList.add(node);
      return newArrayList;
    }

    for (Node<Integer> child : node.children) {
      ArrayList<Node<Integer>> parentToChild = nodeToRootPath(child, k);
      if (parentToChild.size() > 0) {
        parentToChild.add(node);
        return parentToChild;
      }
    }
    return new ArrayList<>();
  }

  public static void printPath(ArrayList<Node<Integer>> list){
    for (Node<Integer> node : list) {
      System.out.println(node.data);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    NodeToRootPath lt = new NodeToRootPath();
    Node<Integer> root = lt.construct(arr);
    int k = 110;
    ArrayList<Node<Integer>> path = nodeToRootPath(root, k);
    printPath(path);

  }
}
