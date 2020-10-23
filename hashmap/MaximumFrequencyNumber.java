import java.util.HashMap;
import java.util.Scanner;
/*

You are given an array of integers that contain numbers in random order. 
Write a program to find and return the number which occurs the maximum times in the given input.

If two or more elements contend for the maximum frequency, return the element which occurs in the array first.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Most frequent element
Constraints :
0 <= N <= 10^8



Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6 
Sample Output 1 :
2
Sample Input 2 :
3
1 4 5
Sample Output 2 :
1


*/

public class MaximumFrequencyNumber {
  public static int maxFrequencyNumber(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      if (map.containsKey(i)) {
        map.put(i, map.get(i) + 1);
      } else {
        map.put(i, 1);
      }
    }
    int ans = Integer.MIN_VALUE, max = 0;
    for (int i : arr) {
      if (map.get(i) > max) {
        max = map.get(i);
        ans = i;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sze = s.nextInt();
    int[] arr = new int[sze];
    for (int index = 0; index < sze; index++) {
      arr[index] = s.nextInt();
    }
    System.out.println(maxFrequencyNumber(arr));
  }
}
