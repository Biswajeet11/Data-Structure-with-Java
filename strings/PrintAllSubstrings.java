/*

Given a String S of length n, print all its substrings.
Substring of a String S is a part of S (of any length from 1 to n), which contains all consecutive characters from S.

Input Format :
String S

Output Format :
All Substrings of S, one in each line.

Constraints :
0 <= |S| <= 10^2
where |S| represents the length of string, S.
Note : The order in which you print substrings doesn't matter.

Sample Input 1 :
xyz

Sample Output 1 :
x
xy
xyz
y
yz
z

Sample Input 2 :
ab

Sample Output 2 :
a
b
ab




*/

package strings;

import java.util.Scanner;

public class PrintAllSubstrings {

  public static void printSubStrings(String s) {
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        System.out.println(s.substring(i, j + 1));
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String s = sc.next();
    printSubStrings(s);
  }
}
