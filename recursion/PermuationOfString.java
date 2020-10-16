import java.util.Scanner;

/*


Print the permutation of String

Sample Input 1:
cba


Sample Output 1:
abc
acb
bac
bca
cab
cba

*/

public class PermuationOfString {

  public static void printPermutation(String input, String output) {

    if (input.length() == 0) {
      System.out.println(output);
    }

    for (int i = 0; i < input.length(); i++) {
      printPermutation(input.substring(0, i) + input.substring(i + 1), output + input.charAt(i));
    }
  }

  public static void printPermutation(String input) {
    printPermutation(input, "");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String s = sc.next();
    System.out.println("The permutation of String");
    printPermutation(s);

  }

}
