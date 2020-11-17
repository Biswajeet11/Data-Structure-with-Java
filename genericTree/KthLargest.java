/*

Question
1. You are given a partially written GenericTree class.
2. You are given a number k. You are required to find and print the kth largest value in the tree.
3. Input and Output is managed for you.

Input Format
Input is managed for you

Output Format
Output is managed for you

Constraints
None

Sample Input
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
8

Sample Output
10

*/

package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class KthLargest {
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

  static int ceil;
  static int floor;

  public static void getCeilAndFloor(Node<Integer> node, int data) {
    if (node.data > data) {
      if (node.data < ceil) {
        ceil = node.data;
      }
    }
    if (data > node.data) {
      if (node.data > floor) {
        floor = node.data;
      }
    }
    for (Node<Integer> child : node.children) {
      getCeilAndFloor(child, data);
    }

  }

  public static int getKthLargest(Node<Integer> node, int k) {
    int data = Integer.MAX_VALUE;
    floor = Integer.MIN_VALUE;

    for (int i = 0; i < k; i++) {
      getCeilAndFloor(node, data);
      data = floor;
      floor = Integer.MIN_VALUE;
    }

    return data;

  }

  public static void main(String[] args) {
    KthLargest sf = new KthLargest();
    int arr[] = { 10, 20, -50, -1, 60, -1, -1, 30, 70, -1, -80, 110, -1, -120, -1, -1, 90, -1, -1, 40, -100, -1, -1,
        -1 };
    Node<Integer> tree = sf.construct(arr);

    ceil = Integer.MAX_VALUE;
    floor = Integer.MIN_VALUE;
    int data = getKthLargest(tree, 2);
    System.out.println(data);
  }
}
