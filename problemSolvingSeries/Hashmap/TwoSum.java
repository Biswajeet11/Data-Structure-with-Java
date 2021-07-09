import java.util.HashMap;
/*

2 Sum
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.

Input: [2, 7, 11, 15], target=9
Output: index1 = 1, index2 = 2


*/

public class TwoSum {
  public int[] twoSum(final int[] A, int B) {
    int arr[] = new int[2];
    arr[0] = Integer.MAX_VALUE;
    arr[1] = Integer.MAX_VALUE;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < A.length; i++) {
      int data = B - A[i];
      if (map.containsKey(data)) {
        arr[1] = i + 1;
        arr[0] = map.get(data) + 1;
        return arr;
      } else if (!map.containsKey(A[i])) {
        map.put(A[i], i);
      }
    }
    if (arr[0] == Integer.MAX_VALUE && arr[1] == Integer.MAX_VALUE) {
      int arr1[] = new int[0];
      return arr1;
    }
    return arr;
  }

  public static void main(String[] args) {
    TwoSum ts = new TwoSum();
    int arr[] = { 2, 7, 11, 15 };
    int k = 9;
    int value[] = ts.twoSum(arr, k);
    for (int i = 0; i < value.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
