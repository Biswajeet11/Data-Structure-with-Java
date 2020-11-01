package strings;

import java.util.Scanner;

public class RemoveCharacter {

  public static String getString(String s, char ch) {
    String output = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ch) {
        output += s.charAt(i);
      }
    }
    return output;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String s = sc.nextLine();
    System.out.println("Enter the character ");
    char ch = sc.next().charAt(0);
    String data = getString(s, ch);
    System.out.println(data);
  }
}
