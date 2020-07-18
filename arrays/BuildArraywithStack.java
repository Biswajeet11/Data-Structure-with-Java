import java.util.ArrayList;
import java.util.List;

/**
 * Given an array target and an integer n. In each iteration, you will read a
 * number from list = {1,2,3..., n}.
 * 
 * Build the target array using the following operations:
 * 
 * Push: Read a new element from the beginning list, and push it in the array.
 * Pop: delete the last element of the array. If the target array is already
 * built, stop reading more elements. You are guaranteed that the target array
 * is strictly increasing, only containing numbers between 1 to n inclusive.
 * 
 * Return the operations to build the target array.
 * 
 * You are guaranteed that the answer is unique.
 * 
 * 
 * 
 * Example:
 * 
 * Input: target = [1,3], n = 3 Output: ["Push","Push","Pop","Push"]
 * Explanation: Read number 1 and automatically push in the array -> [1] Read
 * number 2 and automatically push in the array then Pop it -> [1] Read number 3
 * and automatically push in the array -> [1,3] Example 2:
 * 
 * Input: target = [1,2,3], n = 3 Output: ["Push","Push","Push"] Example 3:
 * 
 * Input: target = [1,2], n = 4 Output: ["Push","Push"] Explanation: You only
 * need to read the first 2 numbers and stop. Example 4:
 * 
 * Input: target = [2,3,4], n = 4 Output: ["Push","Pop","Push","Push","Push"]
 */

public class BuildArraywithStack {
  public static List<String> buildArray(int[] target, int n) {
    List<String> newList = new ArrayList<>();
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (count >= target.length)
        break;
      if (target[count] == i) {
        newList.add("Push");
        count++;
      } else {
        newList.add("Push");
        newList.add("Pop");
      }
    }
    return newList;
  }

  public static void main(String[] args) {
    int target[] = { 1, 4 };
    int n = 4;
    List<String> arrData = buildArray(target, n);
    System.out.println(arrData);
  }
}