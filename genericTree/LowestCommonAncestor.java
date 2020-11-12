package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class LowestCommonAncestor {
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

  public static Node<Integer> lca(Node<Integer> node, int k1, int k2) {
    ArrayList<Node<Integer>> path1 = nodeToRootPath(node, k1);
    ArrayList<Node<Integer>> path2 = nodeToRootPath(node, k2);

    int i = path1.size() - 1;
    int j = path2.size() - 1;

    while (i >= 0 && j >= 0 && path1.get(i) == path2.get(j)) {
      i--;
      j--;
    }
    i++;
    j++;

    return path1.get(i);

  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    LowestCommonAncestor lca = new LowestCommonAncestor();
    Node<Integer> root = lca.construct(arr);
    int k1 = 110;
    int k2 = 120;
    Node<Integer> node = lca(root, k1, k2);
    System.out.println(node.data);
  }
}
