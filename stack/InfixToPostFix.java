import java.util.Stack;

/*
Convert the expression from infix to postfix given the infix expression is valid
*/

public class InfixToPostFix {
  public static int getPrecedence(char ch) {
    switch (ch) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;
    }
    return -1;
  }

  public static String toPostFix(String exp) {
    String outputExp = "";
    Stack<Character> st = new Stack<>();
    for (char ch : exp.toCharArray()) {
      if (Character.isLetterOrDigit(ch)) {
        outputExp += ch;
      } else if (ch == '(') {
        st.push(ch);
      } else if (ch == ')') {
        // System.out.println("inside )"+outputExp);
        // while (!st.isEmpty()) {
        // char popValue = st.pop();
        // int precedence=getPrecedence(popValue);
        // System.out.println("the precedence value" + precedence);
        // }
      } else {
        while (!st.isEmpty() && getPrecedence(ch) <= getPrecedence(st.peek())) {
          outputExp += st.pop();
          // System.out.println("pop" + outputExp);

          // System.out.println("getPrecedence(ch)" + getPrecedence(ch));
          // if(st.peek()!=-1){
          // System.out.println("getPrecedence(st.peek()" + getPrecedence(st.peek()));
          // }

          System.out.println(outputExp);
        }
        st.push(ch);
        // System.out.println("ch"+ch);
      }
      while (!st.isEmpty()) {
        outputExp += st.pop();
        // System.out.println(outputExp);
      }
    }
    return outputExp;
  }

  public static void main(String[] args) {
    String exp = "a+b*(c^d-e)^(f+g*h)-i";
    String postfixExp = toPostFix(exp);
    System.out.println(postfixExp);
  }
}