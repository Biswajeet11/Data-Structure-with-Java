package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class ConstructTree {

  static class Node<T> {
    public T data;
    ArrayList<Node<T>> children;

    public Node(T data) {
      this.data = data;
      children = new ArrayList<Node<T>>();
    }
  }

  public Node<Integer> getData(int arr[]) {
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

  public int size(Node<Integer> root) {
    int childSize = 0;
    for (Node<Integer> child : root.children) {
      childSize += size(child);
    }
    return childSize + 1;
  }

  public int getMaxData(Node<Integer> root) {
    int max = Integer.MIN_VALUE;

    for (Node<Integer> child : root.children) {
      int getmax = getMaxData(child);
      max = Math.max(getmax, max);
    }
    max = Math.max(max, root.data);
    return max;
  }

  public static void main(String[] args) {

    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };

    ConstructTree ct = new ConstructTree();

    Node<Integer> root = ct.getData(arr);

    ct.printTree(root);

    int treeSize = ct.size(root);

    int maxTreeValue = ct.getMaxData(root);

    System.out.println("The tree size" + treeSize);

    System.out.println("The max tree Value" + maxTreeValue);

  }

}
