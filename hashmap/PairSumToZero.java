import java.util.HashMap;
import java.util.Scanner;

/*

Given a random integer array A of size N.
Find and print the pair of elements in the array which sum to 0.
Array A can contain duplicate elements.
While printing a pair, print the smaller element first.
That is, if a valid pair is (6, -6) print "-6 6".
There is no constraint that out of 5 pairs which have to be printed in 1st line. 
You can print pairs in any order, just be careful about the order of elements in a pair.


Input format :
Line 1 : Integer N (Array size)
Line 2 : Array elements (separated by space)

Output format :
Line 1 : Pair 1 elements (separated by space)
Line 2 : Pair 2 elements (separated by space)
Line 3 : and so on



Sample Input:
5
2 1 -2 2 3

Sample Output :
-2 2
-2 2

*/

public class PairSumToZero {
  public static void pairSum(int[] input, int size) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : input) {
      if (!map.containsKey(i)) {
        map.put(i, 1);
      } else {
        map.put(i, map.get(i) + 1);
      }
    }

    for (int i : input) {
      int key = i;
      if (map.containsKey(-key) && map.get(key) != 0) {
        int times = map.get(-key) * map.get(key);
        while (times != 0) {
          System.out.print(-key + " ");
          System.out.println(key);
          times--;
        }
        map.put(key, 0);
        map.put(-key, 0);
      }
    }

  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    pairSum(arr, n);
  }
}
