// package codethon.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

  public static boolean isBalanced(String exp) {

    Stack<Character> st = new Stack<Character>();

    for (int i = 0; i < exp.length(); i++) {
      if (exp.charAt(i) == '[' || exp.charAt(i) == '{' || exp.charAt(i) == '(') {

        st.push(exp.charAt(i));

      }

      else if (exp.charAt(i) == ']') {
        if (!st.empty() && st.peek() == '[') {
          st.pop();
        } else {
          return false;
        }
      } else if (exp.charAt(i) == ')') {
        if (!st.empty() && st.peek() == '(') {
          st.pop();
        } else {
          return false;
        }

      } else if (exp.charAt(i) == '}') {
        if (!st.empty() && st.peek() == '{') {
          st.pop();
        } else {
          return false;
        }

      }
    }

    if (st.empty()) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the expression");
    String exp = sc.nextLine();

    Boolean balanced = isBalanced(exp);
    System.out.println(balanced);
  }
}
