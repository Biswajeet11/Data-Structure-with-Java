import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*

Longest Consecutive Sequence

You are given an array of unique integers that contain numbers in random order.
Write a program to find the longest possible sequence of consecutive numbers using the numbers from given array.
You need to return the output array which contains consecutive elements. 
Order of elements in the output is not important.


Best solution takes O(n) time.
If two sequences are of equal length then return the sequence starting with the number whose occurrence is earlier in the array.
Input Format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Constraints :
0 <= n <= 10^6



Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
Sample Output 1 :
8 
9 
10 
11 
12
Sample Input 2 :
7
3 7 2 1 9 8 41
Sample Output 2 :
7
8
9

Explanation: 
Sequence should be of consecutive numbers.
Here we have 2 sequences with same length i.e. [1, 2, 3] and [7, 8, 9], but output should be [7, 8, 9] 
because the starting point of [7, 8, 9] comes first in input array.

Sample Input 3 :
7
15 24 23 12 19 11 16
Sample Output 3 :
15 
16



*/

public class LCS {

  public static ArrayList<Integer> longestSubsequence(int[] arr) {
    HashMap<Integer, Boolean> map = new HashMap<>();
    for (int i : arr) {
      if (!map.containsKey(i)) {
        map.put(i, true);
      }
    }
    ArrayList<Integer> output = new ArrayList<Integer>();
    int maxcount = 1;
    int startnum = arr[0];
    int newnum;
    for (int i : arr) {
      int count = 0;
      newnum = i;
      while (map.containsKey(newnum)) {
        newnum++;
        count++;
      }
      if (count > maxcount) {
        maxcount = count;
        startnum = i;
      }
    }
    output.add(startnum);
    maxcount--;
    while (maxcount != 0) {
      startnum++;
      output.add(startnum);
      maxcount--;
    }
    return output;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }

    ArrayList<Integer> ans = longestSubsequence(arr);
    for (int num : ans) {
      System.out.println(num);
    }
  }
}
