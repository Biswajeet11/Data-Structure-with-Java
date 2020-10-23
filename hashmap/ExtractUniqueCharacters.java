import java.util.HashMap;
import java.util.Scanner;

/*

Given a string, you need to remove all the duplicates. 
That means, the output string should contain each character only once.
The respective order of characters should remain same.

Input format :
String S

Output format :
Output String

Constraints :
0 <= Length of S <= 10^8

Sample Input 1 :
ababacd
Sample Output 1 :
abcd
Sample Input 2 :
abcde
Sample Output 2 :
abcde



*/

public class ExtractUniqueCharacters {

  public static String uniqueChar(String str) {
    HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
    String ans = "";
    if (str == null) {
      return "";
    }
    for (int i = 0; i < str.length(); i++) {
      if (!map.containsKey(str.charAt(i))) {
        map.put(str.charAt(i), true);
        ans += str.charAt(i);
      }
    }
    return ans;

  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String uniChars = uniqueChar(s.next());
    System.out.println(uniChars);
  }
}
