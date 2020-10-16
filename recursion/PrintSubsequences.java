import java.util.Scanner;

/*

1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Contents of the arraylist containing subsequences as shown in sample output
Constraints
0 <= str.length <= 20
Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]


*/

public class PrintSubsequences {

  public static void printSubsequences(String input, String output) {
    if (input.length() == 0) {
      System.out.println(output);
      return;
    }
    printSubsequences(input.substring(1), output);
    printSubsequences(input.substring(1), output + input.charAt(0));
  }

  public static void printSubsequences(String input) {
    printSubsequences(input, "");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    printSubsequences(s);
  }
}
