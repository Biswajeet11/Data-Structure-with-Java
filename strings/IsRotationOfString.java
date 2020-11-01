import java.util.Scanner;
/*

A Program to check if strings are rotations of each other or not

Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
(eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)

*/

public class IsRotationOfString {

  public static boolean isRotation(String s1, String s2) {
    if ((s1.length() != s2.length()) && (s1 + s1).indexOf(s2) == -1) {
      return false;
    } else {
      return true;
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first String");
    String s1 = sc.next();
    System.out.println("Enter the second String");
    String s2 = sc.next();
    boolean checkRotation = isRotation(s1, s2);
    System.out.println(checkRotation);
  }
}
