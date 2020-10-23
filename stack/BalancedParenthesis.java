import java.util.Stack;

/*
For a given a string expression containing only round brackets or parentheses, 
check if they are balanced or not. Brackets are said to be balanced 
if the bracket which opens last, closes first.

Example:
Expression: (()())
Since all the opening brackets have their corresponding closing brackets, we say it is balanced and hence the output will be,
'true'.
You need to return a boolean value indicating whether the expression is balanced or not.

Note:
The input expression will not contain spaces in between.
Input Format:
The first and the only line of input contains a string expression without any spaces in between.
 Output Format:
The only line of output prints 'true' or 'false'.

Sample Input 1 :
(()()())
Sample Output 1 :
true
Sample Input 2 :
()()(()
Sample Output 2 :
false

*/

public class BalancedParenthesis {
  public static boolean checkBalanced(String exp) {
    Stack<Character> st = new Stack<Character>();
    for (int i = 0; i < exp.length(); i++) {
      if (exp.charAt(i) == '{' || exp.charAt(i) == '[' || exp.charAt(i) == '(') {
        st.push(exp.charAt(i));
      } else if (exp.charAt(i) == '}' || exp.charAt(i) == ')' || exp.charAt(i) == ']') {
        if (!st.empty() && ((exp.charAt(i) == '}' && st.peek() == '{') || (exp.charAt(i) == ']' && st.peek() == '[')
            || (exp.charAt(i) == ')' && st.peek() == '('))) {

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
    String exp = "(()()())";
    boolean isBalanced = checkBalanced(exp);
    System.out.println(isBalanced);
  }
}
