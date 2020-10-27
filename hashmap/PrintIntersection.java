import java.util.HashMap;
import java.util.Scanner;

/*

Print Intersection

You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. 
You need to print their intersection; An intersection for this problem can be defined 
when both the arrays/lists contain a particular value or to put it in other words, 
when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first sorted array/list(ARR1).


Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the first array/list.

The second line contains 'N' single space separated integers representing the elements of the first the array/list.

The third line contains an integer 'M' representing the size of the second array/list.

The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output format :
For each test case, print the intersection elements in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6
0 <= M <= 10^6

Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10

Sample Output 1 :
2 3 4
10

Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2

Sample Output 2 :
1 2 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's.
The first '2' of first array matches with the first '2' of the second array.
Similarly, the second '2' of the first array matches with the second '2' if the second array.




*/

public class PrintIntersection {
  public static void intersection(int[] arr1, int[] arr2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int value = 0;
    for (int i : arr1) {
      if (!map.containsKey(i)) {
        map.put(i, 1);
      } else {
        map.put(i, map.get(i) + 1);
      }
    }
    for (int i : arr2) {
      if (map.containsKey(i)) {
        value = map.get(i);
        if (value > 0) {
          System.out.println(i);
          map.put(i, value - 1);
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int size1 = s.nextInt();
    int size2 = s.nextInt();
    int[] arr1 = new int[size1];
    int[] arr2 = new int[size2];

    for (int index = 0; index < size1; index++) {
      arr1[index] = s.nextInt();
    }

    for (int index = 0; index < size2; index++) {
      arr2[index] = s.nextInt();
    }
    intersection(arr1, arr2);
  }
}
