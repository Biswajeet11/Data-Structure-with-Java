/*

Here I am considering state in pair as 1, 2, 3

where:

* 1 denotes push left node to stack 
* 2 denotes push right node to stack
* 3 denotes pop node from stack

*/

package binaryTree;

import java.util.Stack;

public class ConstructBinaryTree {

  public static class Node<T> {
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data, Node<T> left, Node<T> right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node<Integer> node;
    int state;

    Pair(Node<Integer> node, int state) {
      this.node = node;
      this.state = state;
    }

  }

  public static void display(Node<Integer> node) {
    if (node == null) {
      return;
    }
    String str = "";
    str += node.left == null ? "." : node.left.data;
    str += "<--" + node.data + "-->";
    str += node.right == null ? "." : node.right.data;

    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static void main(String[] args) {
    Integer arr[] = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null };
    Node<Integer> root = new Node<>(arr[0], null, null);
    Pair pair = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(pair);

    int index = 0;

    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        index++;
        if (arr[index] != null) {
          Node<Integer> leftNode = new Node<>(arr[index], null, null);
          top.node.left = leftNode;

          Pair lp = new Pair(leftNode, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }
        top.state++;
      } else if (top.state == 2) {
        index++;
        if (arr[index] != null) {
          Node<Integer> rightNode = new Node<>(arr[index], null, null);
          top.node.right = rightNode;

          Pair rp = new Pair(rightNode, 1);
          st.push(rp);

        } else {
          top.node.right = null;
        }
        top.state++;
      } else if (top.state == 3) {
        st.pop();
      }
    }
    display(root);
  }

}
